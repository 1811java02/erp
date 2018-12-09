$.ajaxSetup({
	error: function () {
		layer.msg("处理失败");
	}
})

/**
 * 启动表单编辑状态
 * @param type 编辑类型：1新增，2修改
 */
function openForm(type) {
	// 关闭翻页
	$("#menu-prev").removeAttr("onclick");
	$("#menu-next").removeAttr("onclick");
	$("#menu-delete").removeAttr("onclick"); // 关闭删除
	$("#list").attr("data-value", "true"); // 打开详单
	switch (type) {
		case 1:
			emptyForm();
			getDate();
			$("#menu-add").attr("onclick", "save()"); // 新增按钮绑定保存
			$("#menu-update").removeAttr("onclick"); // 关闭修改
			break;
		case 2:
			$("#menu-update").attr("onclick", "update()"); // 修改按钮绑定修改
			$("#menu-add").removeAttr("onclick"); // 关闭新增
			$('td[data-write]').attr("contenteditable", true).removeAttr('data-write'); // 详单允许修改
			break;
		default:
			console.info("非法参数");
			break;
	}
	$("#custid,#saleclassid,#wareid,#date,#salesid,#departid").removeAttr("disabled").attr("readonly", true); // 开窗取值的元素
	$("#udef1,#udef2,#remark,#priceoftax,#addrid,#addrow,.list-isgift:not(:eq(0))").removeAttr("disabled"); // 手动修改的元素
	layui.form().render(); // 重新构建表单
}

/**
 * 关闭表单编辑状态
 */
function closeForm() {
	emptyForm();
	$("#menu-add").attr("onclick", "openForm(1)"); // 新增按钮绑定启动表单编辑
	$("#menu-update").attr("onclick", "openForm(2)"); // 修改按钮绑定启动表单编辑
	$("#menu-delete").attr("onclick", "del()"); // 删除按钮绑定删除
	$("#list").attr("data-value", "false"); // 关闭详单
	$("#custid,#saleclassid,#wareid,#date,#salesid,#departid").removeAttr("readonly").attr("disabled", true); // 开窗取值的元素
	$("#udef1,#udef2,#remark,#priceoftax,#addrid,#addrow").attr("disabled", true); // 手动修改的元素
	layui.form().render(); // 重新构建表单
}

/**
 * 清空表单
 */
function emptyForm() {
	$("input[type=text]:not(#currid,#exchrate),textarea").val(null);
	$("select").val(0);
	$("#list tr:not(#list-default)").remove(); // 清空详单
}

/**
 * 打开窗体
 * @param title 标题
 * @param content 内容
 * @returns {*} 窗体
 */
function openWindow(title, content) {
	var index = layer.open({
		type: 1,
		shade: 0,
		area: ['500px', '300px'],
		title: title,
		content: content,
		zIndex: layer.zIndex, // 兼容多窗体
		success: function (layero) {
			layer.setTop(layero);
		},
		cancel: function () {
			closeWindow({index: index, elem: content});
		},
		end: function () {
			closeWindow({index: index, elem: content});
		}
	});
	return index;
}

/**
 * 关闭窗体
 * @param data 信息对象：index窗体，elem相关元素
 */
function closeWindow(data) {
	$(data.elem).parent().parent().remove();
	layer.close(data.index);
}

/**
 * 创建销售出库单
 */
function createDsdssalemain() {
	var main = new Object();
	main['custshortname'] = $('#custid').val();
	main['custaddress'] = $('#addrid').val();
	main['saleclassname'] = $('#saleclassid').val();
	main['priceoftax'] = $('#priceoftax').val();
	main['warename'] = $('#wareid').val();
	main['billdate'] = $('#date').val();
	main['billno'] = $('#billno').val();
	main['currname'] = $('#currid').val();
	main['exchrate'] = $('#exchrate').val();
	main['salesname'] = $('#salesid').val();
	main['departname'] = $('#departid').val();
	main['maker'] = '001';
	main['makername'] = 'Admin';
	main['udef1'] = $('#udef1').val();
	main['udef2'] = $('#udef2').val();
	main['remark'] = $('#remark').val();
	main['custid'] = $('#custid').attr('data-value');
	main['saleclassid'] = $('#saleclassid').attr('data-value');
	main['wareid'] = $('#wareid').attr('data-value');
	main['salesid'] = $('#salesid').attr('data-value');
	main['departid'] = $('#departid').attr('data-value');
	main['dsdssalesub'] = new Array();
	$("#list tr:not(#list-default)").each(function (i, obj) {
		var data = new Object();
		data['prodid'] = $(obj).find('.list-prodid').text();
		data['prodname'] = $(obj).find('.list-prodname').text();
		data['prodsize'] = $(obj).find('.list-prodsize').text();
		data['sunit'] = $(obj).find('.list-sunit').text();
		data['squantity'] = $(obj).find('.list-squantity').text();
		data['oldprice'] = $(obj).find('.list-oldprice').text();
		data['discount'] = $(obj).find('.list-discount').text();
		data['sprice'] = $(obj).find('.list-sprice').text();
		data['amount'] = $(obj).find('.list-amount').text();
		data['taxrate'] = $(obj).find('.list-taxrate').text();
		data['taxamt'] = $(obj).find('.list-taxamt').text();
		data['amountatax'] = $(obj).find('.list-amountatax').text();
		data['isgift'] = $(obj).find('.list-isgift')[0].checked ? 1 : 0;
		data['itemremark'] = $(obj).find('.list-itemremark').text();
		data['trantypename'] = $(obj).find('.list-trantype').text();
		data['formno'] = $(obj).find('.list-formno').text();
		data['custbillno'] = $(obj).find('.list-custbillno').text();
		data['trantype'] = $(obj).find('.list-trantype').attr("data-value");
		console.info(data['isgift'])
		main['dsdssalesub'].push(data);
	});
	return main;
}

/**
 * 计算详单中一条目数据
 * @param obj 条目：tr元素
 */
function calcLine(obj) {
	obj = $(obj);
	var oldprice = obj.find(".list-oldprice").html();
	var discount = obj.find(".list-discount").html();
	obj.find(".list-sprice").html(oldprice * discount / 100); // 计算单价
	var squantity = obj.find(".list-squantity").html();
	var sprice = obj.find(".list-sprice").html();
	obj.find(".list-amount").html(squantity * sprice); // 计算金额
	var amount = obj.find(".list-amount").html();
	var taxrate = obj.find(".list-taxrate").html();
	obj.find(".list-taxamt").html(amount * taxrate / 100); // 计算税额
	var taxamt = obj.find(".list-taxamt").html();
	obj.find(".list-amountatax").html(amount * 1 + taxamt * 1); //计算含税金额
}

/**
 * 获取当前时间
 */
function getDate() {
	var date = new Date();
	var year = date.getFullYear();
	var month = date.getMonth() + 1;
	if (month < 10)
		month = "0" + month;
	var day = date.getDate();
	if (day < 10)
		day = "0" + day;
	date = year + "-" + month + "-" + day;
	$("#date").val(date);
	queryId();
}

/**
 * 获取单据号码
 */
function queryId() {
	$.getJSON("/lhy/query/dsdssalemainId", {date: $("#date").val()}, function (data) {
		$("#billno").val(data);
	})
}

/**
 * 翻页
 * @param page 页码
 */
function toPage(page) {
	closeForm(); // 关闭表单编辑
	var index = layer.load(1); // 开启加载动画
	$.getJSON('/lhy/query/dsdssalemain', {page: page}, function (data) {
		layer.close(index); // 关闭加载动画
		$("#menu-refresh").attr("onclick", "toPage(" + data.pageNum + ")");
		if (data.hasPreviousPage) {
			$("#menu-prev").attr("onclick", "toPage(" + data.prePage + ")");
		} else {
			$("#menu-prev").removeAttr("onclick");
		}
		if (data.hasNextPage) {
			$("#menu-next").attr("onclick", "toPage(" + data.nextPage + ")");
		} else {
			$("#menu-next").removeAttr("onclick");
		}
		var obj = data.list[0];
		if (obj == null) {
			$("#menu-refresh").attr("onclick", "toPage(1)");
			return;
		}
		$('#custid').val(obj['custshortname']);
		$('#addrid').val(obj['custaddress']);
		$('#saleclassid').val(obj['saleclassname']);
		$('#priceoftax').val(obj['priceoftax']);
		$('#wareid').val(obj['warename']);
		$('#date').val(obj['billdate']);
		$('#billno').val(obj['billno']);
		$('#currid').val(obj['currname']);
		$('#exchrate').val(obj['exchrate']);
		$('#salesid').val(obj['salesname']);
		$('#departid').val(obj['departname']);
		$('#maker').val('Admin');
		$('#udef1').val(obj['udef1']);
		$('#udef2').val(obj['udef2']);
		$('#remark').val(obj['remark']);
		$('#custid').attr('data-value', obj['custid']);
		$('#saleclassid').attr('data-value', obj['saleclassid']);
		$('#wareid').attr('data-value', obj['wareid']);
		$('#salesid').attr('data-value', obj['salesid']);
		$('#departid').attr('data-value', obj['departid']);
		$(obj.dsdssalesub).each(function (i, obj) {
			var tr = $("#list-default").clone().show();
			tr.removeAttr("id");
			tr.find('td[contenteditable]').attr("data-write", true).removeAttr('contenteditable');
			tr.find('.list-line').text(i + 1);
			tr.find('.list-prodid').text(obj['prodid']);
			tr.find('.list-prodname').text(obj['prodname']);
			tr.find('.list-prodsize').text(obj['prodsize']);
			tr.find('.list-sunit').text(obj['sunit']);
			tr.find('.list-squantity').text(obj['squantity']);
			tr.find('.list-oldprice').text(obj['oldprice']);
			tr.find('.list-discount').text(obj['discount']);
			tr.find('.list-sprice').text(obj['sprice']);
			tr.find('.list-amount').text(obj['amount']);
			tr.find('.list-taxrate').text(obj['taxrate']);
			tr.find('.list-taxamt').text(obj['taxamt']);
			tr.find('.list-amountatax').text(obj['amountatax']);
			tr.find('.list-isgift').attr("checked", obj['isgift'] == 1 ? true : false);
			tr.find('.list-itemremark').text(obj['itemremark']);
			tr.find('.list-trantype').text(obj['trantypename']);
			tr.find('.list-formno').text(obj['formno']);
			tr.find('.list-custbillno').text(obj['custbillno']);
			tr.find('.list-trantype').attr("data-value", obj['trantype']);
			$("#list").append(tr);
		})
		layui.form().render() // 重新构建表单：启用复选框
	})
}

toPage();

/**
 * 新增销售出库单
 */
function save() {
	var main = createDsdssalemain();
	$.post("/lhy/save/dsdssalemain", {str: JSON.stringify(main)}, function (data) {
		layer.msg(data ? '保存成功' : '保存失败');
		if (data) {
			closeForm();
			toPage();
		}
	}, 'JSON');
}

/**
 * 修改销售出库单
 */
function update() {
	var main = createDsdssalemain();
	$.post("/lhy/update/dsdssalemain", {str: JSON.stringify(main)}, function (data) {
		layer.msg(data ? '修改成功' : '修改失败');
		if (data) {
			closeForm();
			toPage();
		}
	}, 'JSON');
}

/**
 * 删除销售出库单
 */
function del() {
	var billno = $("#billno").val();
	if (billno.length < 1)
		return;
	layer.confirm("确认删除吗", function () {
		$.getJSON("/lhy/del/dsdssalemain", {billno: billno}, function (data) {
			layer.msg(data ? '删除成功' : '删除失败');
			if (data) {
				toPage();
			}
		})
	})
}

/**
 * 开窗查询
 * @param url 请求地址
 * @param params 请求参数
 * @param prop 返回值指定属性
 * @param id 列1取值属性
 * @param name 列2取值属性
 * @param title 窗体标题
 * @param fun 回调函数
 */
function queryList(url, params, prop, id, name, title, fun) {
	$("#windowTable tbody").empty();
	var table = $("#windowTable").clone().removeAttr("id").appendTo("#windowList"); // 将克隆对象追加为实际元素：适配layui1.0
	var index = openWindow(title, table);
	$.getJSON(url, params, function (data) {
		data = prop == null ? data : data[prop]; // 适配参数属性：ajax返回值可能为pageInfo或list
		$(data).each(function (i, obj) {
			var tr = $("<tr></tr>").dblclick(function () {
				fun({obj: obj, index: index, elem: table}); // 回调函数传参：obj本条目相关对象，index窗体，table本次查询创建的元素
			});
			var td1 = $("<td></td>").text(obj[id]);
			var td2 = $("<td></td>").text(obj[name]);
			tr.append(td1, td2);
			table.append(tr);
		})
	})
}

//选择客户
$("#custid").dblclick(function () {
	queryList('/lhy/query/customer', {}, null, 'customerid', 'customerfllnae', '选择客户', function (data) {
		$("#custid").attr("data-value", data.obj.customerfllnae);
		$("#custid").val(data.obj.customerfllnae);
		closeWindow(data);
	});
})
//选择出库类型
$("#saleclassid").dblclick(function () {
	queryList('/lhy/query/billtype', {}, null, 'classid', 'classname', '选择销售出库类型', function (data) {
		$("#saleclassid").attr("data-value", data.obj.classid);
		$("#saleclassid").val(data.obj.classname);
		closeWindow(data);
	});
})
//选择仓库
$("#wareid").dblclick(function () {
	queryList('/lhy/query/warehouse', {}, null, 'wareid', 'warename', '选择仓库', function (data) {
		$("#wareid").attr("data-value", data.obj.wareid);
		$("#wareid").val(data.obj.warename);
		closeWindow(data);
	});
})
//选择业务人员
$("#salesid").dblclick(function () {
	queryList('/lhy/query/personnel', {}, null, 'personid', 'personname', '选择业务人员', function (data) {
		$("#salesid").attr("data-value", data.obj.personid);
		$("#departid").attr("data-value", data.obj.department.departid); // 同时自动选择部门
		$("#salesid").val(data.obj.personname);
		$("#departid").val(data.obj.department.departname);
		closeWindow(data);
	});
})
//详单选择物料
$("body").on('dblclick', ".list-prodid", function () {
	if ($("#list").attr("data-value") == 'false')
		return;
	var elem = this;
	queryList('/lhy/query/dsproduct', {size: -1}, 'list', 'prodid', 'prodname', '选择物料', function (data) {
		$(elem).text(data.obj.prodid).next().text(data.obj.prodname).next().text(data.obj.prodsize).next().text(data.obj.unit).next().next().text(data.obj.suggestprice);
		calcLine($(elem).parent()); // 计算本条详单信息
		closeWindow(data);
	});
})
//详单新增行
$("#addrow").click(function () {
	var tr = $("#list-default").clone().show();
	tr.removeAttr("id");
	tr.find(".list-line").text($("#list tr").length); // 栏号计算
	tr.find(".list-isgift").removeAttr("disabled"); // 启用复选框
	$("#list").append(tr);
	layui.form().render(); // 由于详单中有复选框：重新构建表单
	return false;
})
//详单删除行（双击栏号）
$("body").on("dblclick", ".list-line", function () {
	if ($("#list").attr("data-value") == 'false')
		return;
	$(this).parent().remove();
	// 重新计算栏号
	$(".list-line").each(function (i, obj) {
		$(this).text(i);
	})
})
//详单计算（指定写入项失去焦点：数量，折扣前单价，折数，税率等）
$("body").on("blur", ".list-squantity,.list-oldprice,.list-discount,.list-taxrate", function () {
	calcLine($(this).parent());
})
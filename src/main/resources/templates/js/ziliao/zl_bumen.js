var pageNum=1;
var layer = layui.layer;
var dept=new Vue({
    el:"#Dept",
    data:{
        department:{}
    },
    created:function () {
        var dept=this;
        dept.showDepartment(pageNum)
    },
    methods:{
        showDepartment:function (n) {
            var dept=this;
            jQuery.getJSON("/ch/queryDepartment",{"pageNum":n},function (data) {
                console.info(data);
                dept.department=data;
            })
        }
    }
})
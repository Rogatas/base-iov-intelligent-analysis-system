var categoriesArr = [];
var seriesEngineSpeed = [];


$(function ()
{
    $.ajax({
        type:'post',
        dataType:'json',
        url:getContextPath+'/catalog/recentEngineSpeedRange/showdata.do',//请求数据的地址
        success:function(data){
            if(data == null || data.length == 0){
                alert("不存在数据");
                return;
            }

            //迭代，把异步获取的数据放到数组中
            $.each(data,function(i,d){
                categoriesArr.push(d.innerId);
                seriesEngineSpeed.push([d.minSpeed,d.maxSpeed]);
            });

        },
        error:function(e){
            alert("error");
        }
    });

    $(document).ready(function() {
        //每隔3秒自动调用方法，实现图表的实时更新
        //window.setInterval(getHighchats,3000);
        window.setTimeout(getHighchats,1000);
    });

});

function getHighchats(){

    $('#container').highcharts({
        credits: {  enabled: false},    //去掉highcharts.com商标
        exporting: { enabled: false },  //去掉chart不必要属性
        chart: {
            type: 'columnrange',
            inverted: true
        },

        title: {
            text: '引擎转速范围统计'
        },

        subtitle: {
            text: '统计前一端时间段至此引擎转速范围'
        },

        xAxis: {
            categories: categoriesArr
        },

        yAxis: {
            title: {
                text: '转速 ( r/min )'
            }
        },

        tooltip: {
            valueSuffix: 'r/min'
        },

        plotOptions: {
            columnrange: {
                dataLabels: {
                    enabled: true,
                    formatter: function () {
                        return this.y + 'r/min';
                    }
                }
            }
        },

        legend: {
            enabled: false
        },

        series: [{
            name: '引擎转速',
            data: seriesEngineSpeed
        }]

    });
}
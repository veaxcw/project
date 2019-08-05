//定义model
Ext.define('IRMS.Opertion.Form.PlayModel',{
    extend : 'Ext.data.Model',
    fields : [
        {name : 'name'},
        {name : 'value'},
        
    ]
});


//已完成查询
Ext.define('IRMS.Operation.Form.PlayGrid',{
    extend : 'Ext.grid.Panel',
    initComponent : function(){
        this.store = Ext.create('Ext.data.Store',{
            fields : ['name','value'],
            storeId:'PlayGrid',
            model : 'IRMS.Opertion.Form.PlayModel',
            proxy : {
                type : 'ajax',
                url : '../articleServlet/findTotal.do',
                actionMethods : {
                    getDownload : 'POST'
                },
                reader : {
                    type : 'json',
                    root : 'result'
                }
            },
            autoLoad: true
        });
        PlayGrid = this.store;//将列表中的store其定义为全局变量
        Ext.apply(this,{
            columns : [
                       {dataIndex : 'name',header : '教师编号',width : 100},
                       
                       {dataIndex : 'value',header : '论文数量',width : 200},
                       
                   ]
        });
        this.callParent();
    }
});

//已完成查询
Ext.define('IRMS.Operation.Form.PlayQueryForm',{
    extend : 'Ext.chart.Chart',
    initComponent : function(){
        this.store = Ext.create('Ext.data.Store',{
        	fields : ['name','value'],
            model : 'IRMS.Opertion.Form.PlayModel',
            proxy : {
                type : 'ajax',
                url : '../articleServlet/findTotal.do',
                actionMethods : {
                    getDownload : 'POST'
                },
                reader : {
                    type : 'json',
                    root : 'result'
                }
            },
            autoLoad: true
        });
        PlayQueryForm= this.store;//将报表中的store其定义为全局变量
        Ext.apply(this, {
            margin: '0 0 3 0',
            cls: 'x-panel-body-default',
            shadow: true,//是否显示阴影部分
            animate: true,//是否显示动画效果
            legend:{
            	position:'bottom'//图例显示位置
            },
            //坐标轴定义
            axes: [{
                type: 'Numeric',
                position: 'left',
                fields: ['value'],
                minimum: 0,
                grid:true,//是否显示横向网格线
                hidden: false,
                label: {
                	  renderer: Ext.util.Format.numberRenderer('0,0'),
                }
            }, {
                type: 'Category',
                position: 'bottom',
                fields: ['name'],
                grid:true,//是否显示竖向网格线
            }],
            series: [{
                type: 'column',
                axis: 'left',
                highlight: true, //高亮显示
                style: {width:36},//柱子的宽度
                //鼠标移动到柱子上所显示的数据提示框
                tips: {
                trackMouse: true,//数据提示框是否跟着鼠标移动
                width: 45,//提示框宽度
                height: 28,
                renderer: function (storeItem, item) {
                //this.setTitle(storeItem.get('tml_name') + ' | ' + item.yField + ': ' + storeItem.get(item.yField) + '个');
                	this.setTitle(storeItem.get(item.yField));
                }
                },
                label: {
                    contrast: true,
                    display: 'insideEnd',
                    field: ['value'],
                    color: '#000',
                    orientation: 'vertical',
                    'text-anchor': 'middle'
                },
                xField: 'name',
                yField: ['value'],
               // title:['播放总数量','播放总次数','播放总时长']
            }]
        });
        this.callParent();
    }

});


Ext.define('IRMS.Operation.Form.Play',{
    extend : 'Ext.panel.Panel',
    title : '论文统计',
    initComponent : function(){
        this._initView();
        this.callParent();
    },
    _initView : function(){
        Ext.apply(this,{
            layout : 'border',
            items : [
                Ext.create('IRMS.Operation.Form.PlayQueryForm',{
                    region : 'north',
                    height : 200,
                    
                }),
                
                Ext.create('IRMS.Operation.Form.PlayGrid',{
                	
                    region : 'center',
                })
            ]
        });
    }
});

Ext.onReady(function(){

    var panel = Ext.create('IRMS.Operation.Form.Play');
    Ext.create('Ext.container.Viewport',{
        layout : 'fit',
        items : [{
            xtype : 'tabpanel',
            items : [
                Ext.create('IRMS.Operation.Form.Play')
            ]
        }]
    });
});

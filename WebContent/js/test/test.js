Ext.onReady(function(){
	Ext.each($(".wangEditorCls"),function(val){
		var editor = new wangEditor(val);
		editor.config.menus = [
		                       'source',
		                       'bold',
		                       'italic',
		                       'underline',
		                       'fontsize',
		                       'head',
		                       'alignleft',
		                       'aligncenter',
		                       'alignright',
		                       'img'
		                    ];
		editor.create();
	});
});


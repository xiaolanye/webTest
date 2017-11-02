<!DOCTYPE html>
<html>
<head>
	<!-- <link rel="stylesheet" type="text/css" href="../extjs/resources/css/ext-all.css" /> -->
    <link rel="stylesheet" type="text/css" href="../wangEditor-2.1.22/dist/css/wangEditor.min.css">
</head>
<body style="padding:0 20px;">
    <div id="editor-container" class="container">
        <div id="editor-trigger"><p>aaa</p></div>
    </div>

    <script type="text/javascript" src="../wangEditor-2.1.22/dist/js/lib/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="../wangEditor-2.1.22/dist/js/wangEditor.js"></script>
    <script type="text/javascript">
    $(document).ready(function(){
        var editor = new wangEditor($('#editor-trigger'));
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
    </script>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java"  pageEncoding="UTF-8"  %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<!-- <link rel="stylesheet" type="text/css" href="../extjs/resources/css/ext-all.css" /> -->
    <link rel="stylesheet" type="text/css" href="/webTest/wangEditor-2.1.22/dist/css/wangEditor.min.css">
</head>
<body style="padding:0 20px;">
    <div id="editor-container" class="container">
        <div id="editor-trigger"><p>${name }</p></div>
    </div>

    <script type="text/javascript" src="/webTest/wangEditor-2.1.22/dist/js/lib/jquery-1.10.2.min.js"></script>
    <script type="text/javascript" src="/webTest/wangEditor-2.1.22/dist/js/wangEditor.js"></script>
    <script type="text/javascript" src="/webTest/js/test/test.js"></script>
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

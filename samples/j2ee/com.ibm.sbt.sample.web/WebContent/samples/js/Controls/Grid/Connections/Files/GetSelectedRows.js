require(["sbt/dom", "sbt/controls/grid/connections/FileGrid"], function(dom, FileGrid) {
        var grid = new FileGrid({
	         type : "library"
	    });
		
	    dom.byId("gridDiv").appendChild(grid.domNode);
		         
	    grid.update();
	    
	    dom.byId("selectedBtn").onclick = function(evt) {
	        var files = grid.getSelected();
	        var str = "";
	        for (i in files) {
	            str += files[i].data.getValue("label") + " ";
	        }
	        alert((str.length == 0) ? "Nothing Selected" : str);
	    };
});
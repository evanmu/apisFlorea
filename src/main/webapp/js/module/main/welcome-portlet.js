$(function() {
	$('#portlet-container').portlet({
		sortable : true,
		columns : [{
			width : 500,
			portlets : [{
				title : '应用说明',
				content : {
					style: {
						maxHeight: 600
					},
					type : 'text',
					text : function() {
						return $('.project-info').html();
					}
				}
			}]
		}]
	});
});

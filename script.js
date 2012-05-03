var link_home, link_prj1, link_prj2;

window.onload = function() {

    link_home = document.getElementById('link_home');
    link_prj1 = document.getElementById('link_prj1');
    link_prj2 = document.getElementById('link_prj2');
    link_resm = document.getElementById('resume');

	link_home.onclick = function(e) {
		$('#project_1').fadeOut();
		$('#project_2').fadeOut();
	}

	link_prj1.onclick = function(e) {
		$('#project_2').fadeOut(500, function(e) {
			$('#project_1').fadeIn(500);
		});
	}

	link_prj2.onclick = function(e) {
		$('#project_1').fadeOut(500, function(e) {
			$('#project_2').fadeIn();
		});

		
	}
	
	link_resm.onclick = function(e) {
		$('#project_1').fadeOut(500, function(e) {
			$('#project_2').fadeIn();
		});

}






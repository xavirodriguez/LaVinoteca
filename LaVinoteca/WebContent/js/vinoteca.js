$( document ).ready(function() { 
    $('.spinner').spinner({
        min: 1,
        max: 20,
        step: 1
    });
    
    $('.login').hide();
    $('#acceso').click(function () {
    		$('.login').show(1000);	
    });
  });
$(document).ready(function() {
    
    
    

    $("#fecha_i").on("change",function(){
        
        var start = new Date($(this).val());
        var end = new Date($("#fecha_t").val());
        var diff = Math.round((end- start)/(1000*60*60*24));
       $("#dia").val(diff);
   
       
    });
    
    
     $("#fecha_t").on("change",function(){
         
         var start = new Date($("#fecha_i").val());
        var end = new Date($(this).val());
        var diff = Math.round((end- start)/(1000*60*60*24));
       $("#dia").val(diff);
   
       
     });
    
});
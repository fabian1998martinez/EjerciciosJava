
function Eliminar(id){
swal({
  title: "¿Estás seguro?",
  text: "¡Una vez eliminado, no podrás recuperar este archivo imaginario!",
  icon: "warning",
  buttons: true,
  dangerMode: true
})
.then((ok) => {
    if(ok){
       $.ajax({
           url:"/Publicaciones/" + id + "/eliminar",
           success: function(res){
               console.log(res);
           }
       });
    }
  if (ok) {
    swal("¡Puf! ¡La publicacion  ha sido eliminado!", {
      icon: "success",
    }).then((ok)=>{
        if(ok){
            location.href="/Publicaciones/listaPublicaciones";
        }
    });
  } else {
    swal("¡Tu publicacion está a salvo!");
  }
});

}


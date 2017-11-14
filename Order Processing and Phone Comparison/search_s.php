 


 <script type="text/javascript">

function changeValue(){
    var id=document.getElementById('id').value;
    console.log(id);
     $.ajax({
            type: "POST",
            url: '',
            data: {id:id},
            success: function(data)
            {   
              document.getElementById('mob_name').value = JSON.parse(data).mob_name;
              document.getElementById('mob_brand').value = JSON.parse(data).mob_brand;
              document.getElementById('memory').value = JSON.parse(data).memory;
            }
        });  

}
</script>

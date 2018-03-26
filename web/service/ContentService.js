class ContentService
{
    getContentByCategoryId(id)  {
         var request = new XMLHttpRequest();
         request.open('GET', '/ufc/getCategoryById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var category= JSON.parse(request.responseText );
             return category.content;
         }
         return null;
    }
    getContentById(id) 
    {
         var request = new XMLHttpRequest();
         request.open('GET', '/ufc/GetContentById?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var content= JSON.parse(request.responseText );
             return content;
         }
         return null;
    }
    deleteById(id)
    {  var request = new XMLHttpRequest();
         request.open('GET', '/ufc/DeleteContent?id=' + id, false);
         request.send();
         if (request.status != 200)  {
              alert( request.status + ': ' + request.statusText ); 
         } 
         else    {
             var content= JSON.parse(request.responseText );
             return content;
         }
         return null;
    }
}
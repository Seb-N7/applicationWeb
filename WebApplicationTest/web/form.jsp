<%-- 
    Document   : form
    Created on : 17 juin 2016, 09:35:17
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Formulaire</h1>
        
        <form method="post">
    <div>
        <label for="titre">Titre</label>
        <input type="text" name="titre" />
    </div>
            
    <div>
        <label for="adp">Annee de production</label>
        <input type="text" name="adp" />
        
    </div>
    <div>
        <label for="genre">Genre</label>
   <select name="genre" name="genre">
         <option value="horreur">Horreur</option>
        <option value="porno">Porno</option>
        <option value="comedie">Comedie</option>
   </select>  
    </div>
            
   <div>
        <label for="pays">Pays</label>
   <select name="pays" name="pays">
         <option value="France">France</option>
        <option value="uk">UK</option>
        <option value="italie">Italien</option>
   </select>  
        
    </div>
    
    <div class="button">
        <button type="submit">Envoyer votre message</button>
    </div>
</form>
        
        
    </body>
</html>

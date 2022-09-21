String username = txtUname.getText();
        String password = txtPass.getText();
        String utype = txtUtype.getSelectedItem().toString();
 
        try {
            Class.forName("com.mysql.jdbc.Driver");
             con = DriverManager.getConnection("jdbc:mysql://localhost/employeeinfo","root","");
            
            pst = con.prepareStatement("select * from user where uname =? and password =? and utype = ?");
            
            pst.setString(1, username);
            pst.setString(2, password);
             pst.setString(3, utype);
            
            rs= pst.executeQuery();
            
            if(rs.next())
            {
               int userid = rs.getInt("id");
               this.hide();
               new Main(username,utype).setVisible(true);
              
            }
            
            else
            {
                JOptionPane.showMessageDialog(this,"UserName and Password do not Match");
      
                
            }
          } catch (ClassNotFoundException ex) {
             ex.printStackTrace();
          
          } catch (SQLException ex) {
            
           ex.printStackTrace();
		  }
		  String uname;
String utype;
    
   public Main(String username, String utype) {
        
      
         initComponents();
          this.uname = username;
          
    
          this.utype = utype;
          lblUtype.setText(this.utype);
  
        
         String usertype =  lblUtype.getText().trim();
          
          if(utype.equals("admin"))
          {
          lblUser.setText(this.uname);
          lblUser.setForeground(Color.RED);
                  
          lblUtype.setText(this.utype);        
           lblUtype.setForeground(Color.RED);          
                  
                  
          }
          else if(utype.equals("receptionist"))
          {
          lblUser.setText(this.uname);
          lblUser.setForeground(Color.BLUE);
                  
          lblUtype.setText(this.utype);        
           lblUtype.setForeground(Color.BLUE);      
          }
          else
          {
          lblUser.setText(this.uname);
          lblUser.setForeground(Color.GREEN);
                  
          lblUtype.setText(this.utype);        
           lblUtype.setForeground(Color.GREEN);      
          }
  
        
    }

i have attached the video link below. which will do this tutorials step by step.


 

 

Share on Facebook
Share on Twitter
Share on Google+
Share on Reddit
Share on Pinterest
Share on Linkedin
Share on Tumblr

Ezoicreport this ad
Previous article
Java Color Change Example
Next article
C#.net Color Change Example
RELATED ARTICLES
MORE BY ADMIN
MORE IN JAVA
CLICK TO COMMENT
CHECK ALSO
Id already exists in the database Spring boot Mysql
In this tutorials will teach you how to do the validation in Spring boot.this tutorials co…



Ezoicreport this ad
RECENT POSTS
Id already exists in the database Spring boot Mysql
Spring boot JPA Save records to Mysql database
Spring boot DTO Creation
Spring boot Mysql Database configuration
Spring boot Entity Creation | Table Creation

© Copyright 2020, All Rights Reserved Powered by Tutussfunny
  
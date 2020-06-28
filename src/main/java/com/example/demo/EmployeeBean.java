package com.example.demo;

public class EmployeeBean
{  public int id;
    public String first_name;
    public String last_name;
    public String age;
    public String email;
    public  EmployeeBean(){}
    public  EmployeeBean(int id,String fn,String ln,String ag,String mail)
    {   this.id=id;
        this.first_name=fn;
        this.last_name=ln;
        this.age=ag;
        this.email=mail;

    }
   public int getid()
   {
       return id;
   }
   public void setid(int id)
   {
       this.id=id;
   }
   public String getFirstName()
   {
       return first_name;
   }
   public void setFirstName(String firstname)
   {
       this.first_name=firstname;
   }
   public String getLastName()
   {
       return last_name;
   }
   public void setLastName(String lastname)
   {
       this.last_name=lastname;
   }
   public String getAge()
   {
       return age;
   }
   public void setAge(String ag)
   {
       this.age=ag;
   }
   public String getEmail()
   {
       return email;
   }
   public void setEmail(String Email)
   {
       this.email=Email;
   }
}
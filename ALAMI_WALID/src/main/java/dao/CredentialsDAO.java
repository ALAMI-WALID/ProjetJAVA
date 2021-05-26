package dao;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import Entities.User;
import Entities.Book;
import tools.MySqlConnection;

public class CredentialsDAO {
	
	public static int AddEutdaint(int ide,String Nom,String Prenom,int Age,String log,String pass)  {
	
		MySqlConnection.Connect();
		String sql="insert into etudiant(ide,Nom,Prenom,Age,log,pass) VALUES ('"+ide+"','"+Nom+"','"+Prenom+"','"+Age+"','"+log+"','"+pass+"')";
		int nb=MySqlConnection.Maj(sql);
		MySqlConnection.disconnect();
		return nb;
		
	}
	public static User Authentification(String l, String p) {
		User u=null;
		MySqlConnection.Connect();
		String sql= "select * from etudiant where log ='"+l+"' and pass ='"+p+"'";
		ResultSet rs=MySqlConnection.select(sql);
		try {
			if(rs.next())
			{
			u= new User();
			u.setIde(rs.getInt(1));
			u.setNom(rs.getString(2));
			u.setPrenom(rs.getString(3));
			u.setAge(rs.getInt(4));
			u.setLog(rs.getString(5));
			u.setPass(rs.getString(6));
			}
			else
				return null;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return u;
}

	public static int AddBook(int id,String titre,String NomA,String categorie,String date) {
		
		MySqlConnection.Connect();
		String sql="insert into livers(id,titre,Nom_Auteur,categorie,date_edition) VALUES ('"+id+"','"+titre+"','"+NomA+"','"+categorie+"','"+date+"')";
		int nb=MySqlConnection.Maj(sql);
		MySqlConnection.disconnect();
		return nb;
		
		}
    
	
	public  List<Book> allBook() throws SQLException{
        Book b;
    	List<Book> us=new ArrayList<Book>();
    	MySqlConnection.Connect();
        ResultSet res=MySqlConnection.select("select * from livers");
        try { 
			while(res.next()) {
				b=new Book();
				b.setId(res.getInt(1));
				b.setTitre(res.getString(2));
				b.setNom_Auteur(res.getString(3));
				b.setCategorie(res.getString(4));
				b.setDate_edition(res.getString(5));
				us.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return us;
    }
	public  List<Book> CategoryBook(String categorie) throws SQLException{
        Book b;
    	List<Book> us=new ArrayList<Book>();
    	MySqlConnection.Connect();
        ResultSet res=MySqlConnection.select("select * from livers where categorie="+categorie);
        try { 
			while(res.next()) {
				b=new Book();
				b.setId(res.getInt(1));
				b.setTitre(res.getString(2));
				b.setNom_Auteur(res.getString(3));
				b.setCategorie(res.getString(4));
				b.setDate_edition(res.getString(5));
				us.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return us;
    }
	public  List<Book> Authorbook(String Nom_Auteur) throws SQLException{
        Book b;
    	List<Book> us=new ArrayList<Book>();
    	MySqlConnection.Connect();
        ResultSet res=MySqlConnection.select("select * from livers where categorie="+Nom_Auteur);
        try { 
			while(res.next()) {
				b=new Book();
				b.setId(res.getInt(1));
				b.setTitre(res.getString(2));
				b.setNom_Auteur(res.getString(3));
				b.setCategorie(res.getString(4));
				b.setDate_edition(res.getString(5));
				us.add(b);
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        return us;
    }
}

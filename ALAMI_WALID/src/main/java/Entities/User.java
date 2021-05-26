package Entities;

public class User {
String Nom,Prenom,log,pass;
int ide;
int Age;


@Override
public String toString() {
	return "User [Nom=" + Nom + ", Prenom=" + Prenom + ", log=" + log + ", pass=" + pass + ", ide=" + ide + ", Age="
			+ Age + "]";
}
public int getIde() {
	return ide;
}
public void setIde(int ide) {
	this.ide = ide;
}
public int getAge() {
	return Age;
}
public void setAge(int age) {
	Age = age;
}
public String getNom() {
	return Nom;
}
public void setNom(String nom) {
	Nom = nom;
}
public String getPrenom() {
	return Prenom;
}
public void setPrenom(String prenom) {
	Prenom = prenom;
}
public String getLog() {
	return log;
}
public void setLog(String log) {
	this.log = log;
}
public String getPass() {
	return pass;
}
public void setPass(String pass) {
	this.pass = pass;
}

}

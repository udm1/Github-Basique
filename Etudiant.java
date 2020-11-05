package com.eudoxie;
//
//
//
public class Etudiant {
	private String id;
	private  String nom;
	private String age;
	private String departement;
	private String annee;

	public Etudiant(String id ,String nom, String age, String departement, String annee) {
		this.id = id;
		this.nom = nom;
		this.age = age;
		this.departement = departement;
		this.annee = annee;
		
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getAge() {
		return age;
	}

	public void setAge(String age) {
		this.age = age;
	}

	public String getDepartement() {
		return departement;
	}

	public void setDepartement(String departement) {
		this.departement = departement;
	}

	public String getAnnee() {
		return annee;
	}

	public void setAnnee(String annee) {
		this.annee = annee;
	}

	@Override
	public String toString() {
		return nom +" "+  age +" "+ departement+ " "+ annee;
		
		
		
	}

	
}

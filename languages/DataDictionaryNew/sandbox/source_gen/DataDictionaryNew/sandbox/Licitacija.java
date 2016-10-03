package Licitacija;

public class Osoba {
  private int OsobaId ;
  private String Ime;
  private String Prezime ;
  private Mesto Mesto;
  private Date Godina;
  private List<Mesto> MetoList;
  private Prijava Prijava;
  private Mesto A;
  
  public Osoba(); 

  public int getOsobaId (){
    return OsobaId ;
  }

  piblic setOsobaId (int val) {
    this.OsobaId  = val;
  }

  public String getIme(){
    return Ime;
  }

  piblic setIme(String val) {
    this.Ime = val;
  }

  public String getPrezime (){
    return Prezime ;
  }

  piblic setPrezime (String val) {
    this.Prezime  = val;
  }

  public Mesto getMesto(){
    return Mesto;
  }

  piblic setMesto(Mesto val) {
    this.Mesto = val;
  }

  public Date getGodina(){
    return Godina;
  }

  piblic setGodina(Date val) {
    this.Godina = val;
  }

  public List<Mesto> getMetoList(){
    return MetoList;
  }

  piblic setMetoList(List<Mesto> val) {
    this.MetoList = val;
  }

  public Prijava getPrijava(){
    return Prijava;
  }

  piblic setPrijava(Prijava val) {
    this.Prijava = val;
  }

  public Mesto getA(){
    return A;
  }

  piblic setA(Mesto val) {
    this.A = val;
  }
 }

public class Mesto {
  private int MestoId;
  private String Naziv;
  
  public Mesto(); 

  public int getMestoId(){
    return MestoId;
  }

  piblic setMestoId(int val) {
    this.MestoId = val;
  }

  public String getNaziv(){
    return Naziv;
  }

  piblic setNaziv(String val) {
    this.Naziv = val;
  }
 }

public class Prijava {
  private int PrijavaId;
  private String Naziv;
  
  public Prijava(); 

  public int getPrijavaId(){
    return PrijavaId;
  }

  piblic setPrijavaId(int val) {
    this.PrijavaId = val;
  }

  public String getNaziv(){
    return Naziv;
  }

  piblic setNaziv(String val) {
    this.Naziv = val;
  }
 }

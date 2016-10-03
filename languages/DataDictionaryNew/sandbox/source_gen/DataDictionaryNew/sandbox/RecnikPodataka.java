package RecnikPodataka;

public class Radnik {
  private int Ime;
  private int Prezime;
  private Date DatumZaposlenja;
  
  public Radnik(); 

  public int getIme(){
    return Ime;
  }

  piblic setIme(int val) {
    this.Ime = val;
  }

  public int getPrezime(){
    return Prezime;
  }

  piblic setPrezime(int val) {
    this.Prezime = val;
  }

  public Date getDatumZaposlenja(){
    return DatumZaposlenja;
  }

  piblic setDatumZaposlenja(Date val) {
    this.DatumZaposlenja = val;
  }
 }

public class Stavka {
  private int RedniBroj;
  private String Proizvod;
  private int Cena;
  private int Kolicina;
  
  public Stavka(); 

  public int getRedniBroj(){
    return RedniBroj;
  }

  piblic setRedniBroj(int val) {
    this.RedniBroj = val;
  }

  public String getProizvod(){
    return Proizvod;
  }

  piblic setProizvod(String val) {
    this.Proizvod = val;
  }

  public int getCena(){
    return Cena;
  }

  piblic setCena(int val) {
    this.Cena = val;
  }

  public int getKolicina(){
    return Kolicina;
  }

  piblic setKolicina(int val) {
    this.Kolicina = val;
  }
 }

public class Racun {
  private int BrojRacuna;
  private List<Stavka> Stavka;
  private Date Datum;
  private Radnik Radnik;
  
  public Racun(); 

  public int getBrojRacuna(){
    return BrojRacuna;
  }

  piblic setBrojRacuna(int val) {
    this.BrojRacuna = val;
  }

  public List<Stavka> getStavka(){
    return Stavka;
  }

  piblic setStavka(List<Stavka> val) {
    this.Stavka = val;
  }

  public Date getDatum(){
    return Datum;
  }

  piblic setDatum(Date val) {
    this.Datum = val;
  }

  public Radnik getRadnik(){
    return Radnik;
  }

  piblic setRadnik(Radnik val) {
    this.Radnik = val;
  }
 }

public class Profesor {
  private String ImeProfesora;
  private String PrezimeProfesora;
  
  public Profesor(); 

  public String getImeProfesora(){
    return ImeProfesora;
  }

  piblic setImeProfesora(String val) {
    this.ImeProfesora = val;
  }

  public String getPrezimeProfesora(){
    return PrezimeProfesora;
  }

  piblic setPrezimeProfesora(String val) {
    this.PrezimeProfesora = val;
  }
 }

public class Student {
  private String ImeStudenta;
  private String PrezimeStudenta;
  private String BrojIndeksa;
  
  public Student(); 

  public String getImeStudenta(){
    return ImeStudenta;
  }

  piblic setImeStudenta(String val) {
    this.ImeStudenta = val;
  }

  public String getPrezimeStudenta(){
    return PrezimeStudenta;
  }

  piblic setPrezimeStudenta(String val) {
    this.PrezimeStudenta = val;
  }

  public String getBrojIndeksa(){
    return BrojIndeksa;
  }

  piblic setBrojIndeksa(String val) {
    this.BrojIndeksa = val;
  }
 }

public class Predmet {
  private int SifraPredmeta;
  private String NazivPredmeta;
  
  public Predmet(); 

  public int getSifraPredmeta(){
    return SifraPredmeta;
  }

  piblic setSifraPredmeta(int val) {
    this.SifraPredmeta = val;
  }

  public String getNazivPredmeta(){
    return NazivPredmeta;
  }

  piblic setNazivPredmeta(String val) {
    this.NazivPredmeta = val;
  }
 }

public class IspitnaPrijava {
  private Student prijavio;
  private Predmet Predmet;
  private Date DatumPrijave;
  private int Ocena;
  private Profesor potpisao;
  
  public IspitnaPrijava(); 

  public Student getPrijavio(){
    return prijavio;
  }

  piblic setPrijavio(Student val) {
    this.prijavio = val;
  }

  public Predmet getPredmet(){
    return Predmet;
  }

  piblic setPredmet(Predmet val) {
    this.Predmet = val;
  }

  public Date getDatumPrijave(){
    return DatumPrijave;
  }

  piblic setDatumPrijave(Date val) {
    this.DatumPrijave = val;
  }

  public int getOcena(){
    return Ocena;
  }

  piblic setOcena(int val) {
    this.Ocena = val;
  }

  public Profesor getPotpisao(){
    return potpisao;
  }

  piblic setPotpisao(Profesor val) {
    this.potpisao = val;
  }
 }

public class Osoaba {
  private int OsobaId;
  private String Naziv;
  
  public Osoaba(); 

  public int getOsobaId(){
    return OsobaId;
  }

  piblic setOsobaId(int val) {
    this.OsobaId = val;
  }

  public String getNaziv(){
    return Naziv;
  }

  piblic setNaziv(String val) {
    this.Naziv = val;
  }
 }

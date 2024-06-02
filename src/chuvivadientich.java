public class chuvivadientich {
    public static void main(String[] args) throws Exception {
    tinhchuvivadientich chuvivadientich1 = new tinhchuvivadientich();
    chuvivadientich1.r = 5;
    double chuvi = chuvivadientich1.tinhchuvihinhtron();
    System.out.printf("chu vi hinh tron laf %f : %n",chuvi);
    double dientich = chuvivadientich1.tinhdientichhinhtron();
    System.out.printf("dien tich hinh tron la %f :",dientich);
}
}
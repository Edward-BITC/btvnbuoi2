public class tangtocxe {
    public static void main(String[] args) throws Exception {
    tocdo tocdo1 = new tocdo();
    int tanglan1 = tocdo1.upto20(); 
    System.out.printf("toc do xe khi tang lan 1 la :%dkm/h %n",tanglan1); 
    tocdo1.speed =tanglan1;
    int tanglan2 = tocdo1.upto40(); 
    System.out.printf("toc do xe khi tang lan 2 la :%dkm/h %n ",tanglan2); 
    tocdo1.speed =tanglan2;
    int tanglan3 = tocdo1.upto60(); 
    System.out.printf("toc do xe khi tang lan 3 la :%dkm/h %n ",tanglan3); 
    tocdo1.speed =tanglan3;
    int tanglan4 = tocdo1.upto60(); 
    System.out.printf("toc do xe khi tang lan 4 la :%dkm/h %n ",tanglan4); 
}
}
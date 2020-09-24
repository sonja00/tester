
/**
 * Beschreiben Sie hier die Klasse DezToOkt.
 * 
 * @author (Ihr Name) 
 * @version (eine Versionsnummer oder ein Datum)
 */
public class DezToHex
{
   private int dezimalzahl;
   
   public DezToHex(int d)
   {
       dezimalzahl = d;
    }
    
   public void Umwandlung()
   {
      int d = dezimalzahl;
      StringBuilder hex = new StringBuilder("");
      int e;
      
      
      while(d%16 != 0)
      {
          e = d%16;
      switch(e)
      {
          case 10: hex = hex.append("A");
          break;
          case 11: hex = hex.append("B");
          break;
          case 12: hex = hex.append("C");
          break;
          case 13: hex = hex.append("D");
          break;
          case 14: hex = hex.append("E");
          break;
          case 15: hex = hex.append("F");
          break;
          default: String h = Integer.toString(e);
                    hex = hex.append(h);
          break;
        }
        d = d/16;
    }
   hex = hex.reverse();
   System.out.println( "Die Hexademzimalzahl ist: " + hex + " Die Dezimalzahl war: " + dezimalzahl);
}
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Program;
import java.util.Comparator;
public class urutnim implements Comparator<Mahasiswa> 
{
      @Override
    public int compare(Mahasiswa a, Mahasiswa b)
    {
        return a.getnim().compareToIgnoreCase(b.getnim());
    
    }
}
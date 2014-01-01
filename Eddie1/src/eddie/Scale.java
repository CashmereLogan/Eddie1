/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eddie;

/**
 *
 * @author cal
 */
public enum Scale {
	Major_Scale("Major Scale"),
	Minor_Scale("Minor Scale"),
	Pentatonic_Major("Pentatonic Major"),
	Pentatonic_Minor("Pentatonic Minor"),
	Pentatonic_Major_First("Pentatonic Major, First Position"),
	Pentatonic_Major_Second("Pentatonic Major, Second Position"),
	Pentatonic_Major_Third("Pentatonic Major, Third Position");
	
	
	private String name;
	
	private Scale(String friendlyName){
		this.name = friendlyName;
	}
	
	public String getFriendlyName(){
		return name;
	}
	
}

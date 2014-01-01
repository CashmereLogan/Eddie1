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
public enum Key {
	
	A("Key of A"),
	B("Key of B"),
	C("Key of C"),
	D("Key of D"),
	E("Key of E"),
	F("Key of F"),
	G("Key of G");
	
	private String name;
	
	private Key(String keyName){
		this.name = keyName;
    }
	
	public String getKeyName(){
		return name;
	}
}
	
	

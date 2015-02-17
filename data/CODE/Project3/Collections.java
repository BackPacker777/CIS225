/**
 * @author hbates@northmen.org
 * @version 01.10.2012.1
 * ASSIGNMENT: Hashes
 * PURPOSE: For showing Java collections
 *
 * http://www.pakzilla.com/2009/08/24/hashmap-vs-hashtable-vs-hashset/
 */

package Collections;

import java.util.HashMap;
import java.util.HashSet;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

public class MapsNSuch {
    private HashMap<Integer, String> mapOne;
    private HashSet<String> setOne;
    private ArrayList<String> arrayOne;

    public MapsNSuch() {
        mapOne = new HashMap<>();
        setOne = new HashSet<>();
        arrayOne = new ArrayList<>();
    }

    public void setMapOne(int key, String value) {
        mapOne.put(key, value);
    }

    public void setSetOne(String item) {
        setOne.add(item);
    }

    public void setArrayOne(String item) {
        arrayOne.add(item);
    }

    public void printArrayOne() {
        Iterator<String> it = arrayOne.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void printArrayOneItem(String search) {
        int index = 0;
        boolean found = false;
        while (index < arrayOne.size() && found != true) {
            String item = arrayOne.get(index);
            if (item.contains(search)) {
                found = true;
            } else {
                index++;
            }
        }
        if (!found) {
            System.out.println("Item: " + search + " not found.");
        } else {
            System.out.println("Item: " + search + " found.");
        }
    }

	public void printMapOne(int key) {
		String value = mapOne.get(key);
		System.out.println(value);
	}

	public void printSetOne() {
		for (String item : setOne) {
			System.out.println(item);
		}
	}

	public void displayRandomNum(int num) {
		Random rand = new Random();
		int randomNum = rand.nextInt(num) + 1;
		System.out.println("" + randomNum);
	}
}

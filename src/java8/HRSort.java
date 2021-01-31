package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

class Item implements Comparable
{

	@Override
	public String toString() {
		return "Item [itemName=" + itemName + ", relevance=" + relevance + ", price=" + price + "]";
	}


	public String itemName;
	public int relevance;
	public int price;
	

	public Item(String itemName, String relevance, String price) {
		super();
		this.itemName = itemName;
		this.relevance = Integer.parseInt(relevance);
		this.price = Integer.parseInt(price);
	}

	@Override
	public int compareTo(Object o) {
	int returnInt = 0;
	Item i1 = (Item) o;
	if(HRSort.sortParameterr == 1)
	{
		returnInt = (this.relevance < i1.relevance) ? -1 : 1;
	}
	else if(HRSort.sortParameterr == 2)
	{
		returnInt = (this.price < i1.price) ? -1 : 1;
	}
	return returnInt;
	}

}

public class HRSort {
	
	public static int sortParameterr;
	public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int itemsPerPage, int pageNumber) {
	    
		sortParameterr = sortParameter;
		List<String> ret = new ArrayList<String>();
		List<List<Item>> sortedItems = new ArrayList<List<Item>>();
		
		Map<String,List<String>> pageIntendedsortedItems = new HashMap<String,List<String>>();

		Set<Item> SS = new TreeSet<Item>();
		
		for(List<String> item: items)
		{
			SS.add( new Item(item.get(0),item.get(1),item.get(2)));
		}
		
		sortedItems = new ArrayList(SS);
		
		//PageInitation
		
		int totPages = (int) Math.round(Math.ceil(items.size()/itemsPerPage) + 1);
		for(int page=0;page < totPages ; page++)
		{
			List<String> pageList = new ArrayList<String>();
			for(int ic=0;ic < itemsPerPage && ic < sortedItems.size() ; ic++)
			{
				Item item = (Item) sortedItems.get(ic);
				String currItemName = item.itemName;
				pageList.add(currItemName);
			}
			
			pageIntendedsortedItems.put("Page" + page, pageList);
		}
		
		
		//PageInitation		
		if(sortOrder > 1)
		{
			Collections.reverse(ret);
		}
		
		ret = pageIntendedsortedItems.get("Page" + (pageNumber-1));
		return ret;

    }
	
	public static void main(String ar[])
	{
		String[][] itemArray = {{"item1","100","1000"},{"item2","99","990"},{"item3","98","980"},{"item4","97","970"},{"item5","96","960"},{"item6","90","900"},
				{"item7","87","870"},{"item8","1000","10000"},{"item9","990","99000"},{"item10","95","950"}};
		//[item7, item6, item10, item5, item4, item3, item2, item1, item9, item8]
		List<String> item1 = Arrays.asList(itemArray[0]);
		List<String> item2 = Arrays.asList(itemArray[1]);
		List<String> item3 = Arrays.asList(itemArray[2]);
		List<String> item4 = Arrays.asList(itemArray[3]);
		
		List<List<String>> itemsParam = new ArrayList<List<String>>();
		itemsParam.add(item1);    itemsParam.add(item2);		itemsParam.add(item3);		itemsParam.add(item4);
		itemsParam.add(Arrays.asList(itemArray[4]));
		itemsParam.add(Arrays.asList(itemArray[5]));
		itemsParam.add(Arrays.asList(itemArray[6]));
		itemsParam.add(Arrays.asList(itemArray[7]));
		itemsParam.add(Arrays.asList(itemArray[8]));
		itemsParam.add(Arrays.asList(itemArray[9]));
		
		itemsParam.add(item1);    itemsParam.add(item2);		itemsParam.add(item3);		itemsParam.add(item4);
		itemsParam.add(Arrays.asList(itemArray[4]));
		itemsParam.add(Arrays.asList(itemArray[5]));
		itemsParam.add(Arrays.asList(itemArray[6]));
		itemsParam.add(Arrays.asList(itemArray[7]));
		itemsParam.add(Arrays.asList(itemArray[8]));
		itemsParam.add(Arrays.asList(itemArray[9]));
		
		itemsParam.add(item1);    itemsParam.add(item2);		itemsParam.add(item3);		itemsParam.add(item4);
		itemsParam.add(Arrays.asList(itemArray[4]));
		itemsParam.add(Arrays.asList(itemArray[5]));
		itemsParam.add(Arrays.asList(itemArray[6]));
		itemsParam.add(Arrays.asList(itemArray[7]));
		itemsParam.add(Arrays.asList(itemArray[8]));
		itemsParam.add(Arrays.asList(itemArray[9]));

		itemsParam.add(item1);    itemsParam.add(item2);		itemsParam.add(item3);		itemsParam.add(item4);
		itemsParam.add(Arrays.asList(itemArray[4]));
		itemsParam.add(Arrays.asList(itemArray[5]));
		itemsParam.add(Arrays.asList(itemArray[6]));
		itemsParam.add(Arrays.asList(itemArray[7]));
		itemsParam.add(Arrays.asList(itemArray[8]));
		itemsParam.add(Arrays.asList(itemArray[9]));
		
		itemsParam.add(item1);    itemsParam.add(item2);		itemsParam.add(item3);		itemsParam.add(item4);
		itemsParam.add(Arrays.asList(itemArray[4]));
		itemsParam.add(Arrays.asList(itemArray[5]));
		itemsParam.add(Arrays.asList(itemArray[6]));
		itemsParam.add(Arrays.asList(itemArray[7]));
		itemsParam.add(Arrays.asList(itemArray[8]));
		itemsParam.add(Arrays.asList(itemArray[9]));
		
		itemsParam.add(item1);    itemsParam.add(item2);		itemsParam.add(item3);		itemsParam.add(item4);
		itemsParam.add(Arrays.asList(itemArray[4]));
		itemsParam.add(Arrays.asList(itemArray[5]));
		itemsParam.add(Arrays.asList(itemArray[6]));
		itemsParam.add(Arrays.asList(itemArray[7]));
		itemsParam.add(Arrays.asList(itemArray[8]));
		itemsParam.add(Arrays.asList(itemArray[9]));
		
		itemsParam.add(item1);    itemsParam.add(item2);		itemsParam.add(item3);		itemsParam.add(item4);
		itemsParam.add(Arrays.asList(itemArray[4]));
		itemsParam.add(Arrays.asList(itemArray[5]));
		itemsParam.add(Arrays.asList(itemArray[6]));
		itemsParam.add(Arrays.asList(itemArray[7]));
		itemsParam.add(Arrays.asList(itemArray[8]));
		itemsParam.add(Arrays.asList(itemArray[9]));
		
		itemsParam.add(item1);    itemsParam.add(item2);		itemsParam.add(item3);		itemsParam.add(item4);
		itemsParam.add(Arrays.asList(itemArray[4]));
		itemsParam.add(Arrays.asList(itemArray[5]));
		itemsParam.add(Arrays.asList(itemArray[6]));
		itemsParam.add(Arrays.asList(itemArray[7]));
		itemsParam.add(Arrays.asList(itemArray[8]));
		itemsParam.add(Arrays.asList(itemArray[9]));
		
		itemsParam.add(item1);    itemsParam.add(item2);		itemsParam.add(item3);		itemsParam.add(item4);
		itemsParam.add(Arrays.asList(itemArray[4]));
		itemsParam.add(Arrays.asList(itemArray[5]));
		itemsParam.add(Arrays.asList(itemArray[6]));
		itemsParam.add(Arrays.asList(itemArray[7]));
		itemsParam.add(Arrays.asList(itemArray[8]));
		itemsParam.add(Arrays.asList(itemArray[9]));
		
		itemsParam.add(item1);    itemsParam.add(item2);		itemsParam.add(item3);		itemsParam.add(item4);
		itemsParam.add(Arrays.asList(itemArray[4]));
		itemsParam.add(Arrays.asList(itemArray[5]));
		itemsParam.add(Arrays.asList(itemArray[6]));
		itemsParam.add(Arrays.asList(itemArray[7]));
		itemsParam.add(Arrays.asList(itemArray[8]));
		itemsParam.add(Arrays.asList(itemArray[9]));
		
		itemsParam.add(item1);    itemsParam.add(item2);		itemsParam.add(item3);		itemsParam.add(item4);
		itemsParam.add(Arrays.asList(itemArray[4]));
		itemsParam.add(Arrays.asList(itemArray[5]));
		itemsParam.add(Arrays.asList(itemArray[6]));
		itemsParam.add(Arrays.asList(itemArray[7]));
		itemsParam.add(Arrays.asList(itemArray[8]));
		itemsParam.add(Arrays.asList(itemArray[9]));
		
		System.out.println(fetchItemsToDisplay(itemsParam, 1,0,30,4));
//		public static List<String> fetchItemsToDisplay(List<List<String>> items, int sortParameter, int sortOrder, int itemsPerPage, int pageNumber) {
	}

}

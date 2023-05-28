package UBP_Miner;

import java.util.Arrays;

 
public class Itemset {
	public int[] itemset;
	long utility;
	int support;

	public Itemset(int[] itemset, long utility, int support) {
		this.itemset = itemset;
		this.utility = utility;
		this.support = support;
	}

//	@Override
	public String toString() {
		return Arrays.toString(itemset) + " utility : " + utility + " support:  " + support;
	}

}

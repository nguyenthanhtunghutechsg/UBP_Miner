package UBP_Miner;

public class Partition {
	Long TidSet;
	Long Suru;
	Long support;

	public Partition(Long tidSet, Long suru, Long support) {
		super();
		TidSet = tidSet;
		Suru = suru;
		this.support = support;
	}

	public Partition() {
		TidSet = 0l;
		Suru = 0l;
		support = 0l;
	}

}

package UBP_Miner;

public class UBP {
	Partition[] partitions;
	UtilityList utilityList;

	public UBP(Partition[] partitions, UtilityList utilityList) {
		super();
		this.partitions = partitions;
		this.utilityList = utilityList;
	}

	public UBP(int item, int pCount) {
		partitions = new Partition[pCount];
		for (int i = 0; i < partitions.length; i++) {
			partitions[i] = new Partition();
		}
		utilityList = new UtilityList(item);
	}
}

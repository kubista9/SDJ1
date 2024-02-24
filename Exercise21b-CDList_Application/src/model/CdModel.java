package model;

public interface CdModel {
	public Cd getCd(int index);
	public CdList getCdsByTitle(String title);
	public int getNumberOfCds();
	public void addCd(Cd cd);
	public Cd removeFirstCdByTitle();
}

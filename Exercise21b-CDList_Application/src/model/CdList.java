package model;

import java.util.ArrayList;

public class CdList {
	private int java;
	private ArrayList<Cd> cds = new ArrayList<>();

	public CdList(){
		this.cds = new ArrayList<>();
	}

	public Cd getCd(int index){
		return cds.get(index);
	}

	public ArrayList<Cd> getCdsByTitle(String title){
		ArrayList<Cd> cdsByTitle = new ArrayList<>();
		for (int i = 0; i < cds.size(); i++) {
			if (cds.get(i).getTitle().equals(title)){
				cdsByTitle.add(cds.get(i));
			}
		}
		return cdsByTitle;
	}

	public int getNumberOfCds(){
		return cds.size();
	}

	public void addCd(Cd cd){
		cds.add(cd);
	}

	public void removeCdByIndex(int index){
		cds.remove(index);
	}

//	public Cd removeFirstCdByTitle(String title){
//		for (int i = 0; i < cds.size(); i++){
//			if (cds.get(i).getTitle().equals(title)){
//				cds.remove(i);
//				break;
//			}
//		}
//		return cds;
//	}


	@Override
	public String toString() {
		return "CdList{" + "java=" + java + ", cds=" + cds + '}';
	}
}

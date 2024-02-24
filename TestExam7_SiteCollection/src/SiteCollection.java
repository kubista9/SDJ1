public class SiteCollection {
	private int size;
	public static final int MAX_SITES = 25;
	private Website[] websites;

	public SiteCollection() {
		this.size = 0;
		this.websites = new Website[MAX_SITES];
	}

	public int getNumberOfSites(){
		return size;
	}

	public void addSite(Website site){
		if (size < getNumberOfSites() && size >= 0){
			websites[size] = site;
			size++;
		}
	}

	public void removeSite(String url){
		for (int i = 0; i < getNumberOfSites(); i++){
			if (websites[i].getUrl().equals(url)){
				for (int j = 0; j < getNumberOfSites()-2; j--){
					websites[j] = websites[j++];
				}
				websites[getNumberOfSites()-1] = null;
				size--;
				break;
			}
		}
	}

	public Website getSite(int index){
		return websites[index];
	}

	public boolean contains(Website site){
		for (int i = 0; i < getNumberOfSites(); i++){
			if (websites[i].getUrl().equals(site)){
				return true;
			}
		}
		return false;
	}

}

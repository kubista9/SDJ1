import java.util.ArrayList;

public class Forum {
	private String name;
	private ArrayList<Post> posts;

	public Forum(String name){
		this.name = name;
		this.posts = new ArrayList<Post>();
	}

	public String getName(){
		return name;
	}

	public void addPost(Post post){
		posts.add(post);
	}

	public void removePost(Post post){
		posts.remove(post);
	}

	public int getPostCount(){
		return posts.size();
	}

	public ArrayList<Post> getPostsBy(String memberName){
		ArrayList<Post> posts2 = new ArrayList<Post>();
		for (int i = 0; i < getPostCount(); i++){
			if (posts.get(i).getMember().equals(memberName)){
				posts2.add(posts.get(i));
			}
		}
	}
}

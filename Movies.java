package Movies;


public class Movies {

	public static void main(String[] args) {
		String[] actorsMovie1 ={"Harrison Ford", " Shia LaBeouf", "Karen Allen"} ;
		String[] actorsMovie2 ={"Harrison Ford", "Sean Connery","Denholm Elliott"} ;
		String[] actorsMovie3 = {"Harrison Ford", "Kate Capshaw", "Jonathan Ke Quan"};
		
		String[][] actors = new String[][] {
			actorsMovie1,
			actorsMovie2,
			actorsMovie3
		};

		String[] movies = {"Indiana Jones et le Royaume du Crâne de Cristal","Indiana Jones et la Dernière Croisade"
				,"Indiana Jones et le Temple maudit"};
		
		for (int i = 0;i<movies.length;i++) {
				 System.out.println("Dans le film "+movies[i]+", les principaux acteurs sont :"+actors[i][0]+", "+actors[i][1]+", "+actors[i][2]);
			}
		
			}
}

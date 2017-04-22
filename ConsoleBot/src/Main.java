import java.util.*;

public class Main
{
	public static void main(String[] arg){
		
		// вечный цикл
		for(int a=0;a<=15;a++){
			a--;
			System.out.println("Ввод:=>");
			System.out.println();
			Scanner i=new Scanner (System.in);
			String  v=i.nextLine();

          // проверка введённого значения
			switch(v){
				case("help"):
					System.out.println();
					System.out.println("help - показать все команды ");
					System.out.println("random - рандомное целое число ");
					System.out.println("hi или привет - приветствие");
					break;
				case("random"):
					System.out.println();
					System.out.println("Введите до скольки: ");
					Scanner l=new Scanner(System.in);
					String h=l.nextLine();
					int f=Integer.parseInt(h);

					int j=(int) (Math.random()*f);
					System.out.println();
					System.out.println(j);
		            break;
				case("games"):
					System.out.println();
					System.out.println("Game:");
					System.out.println("sea battle");

					break;
				case("sea battle"):
					System.out.println();
					char[][] o;
					o = new char[9][9];

					for(int x=0;x<9;x++){
						for(int y=0;y<9;y++){
							o[x][y]='-';
						}
					}

					for(int x=0;x<9;x++){
						for(int y=0;y<9;y++){}
					}

					break;
				case("hi"):
				    System.out.println();
					System.out.println("Hi!");
				    break;
				case("привет"):
					System.out.println();
					System.out.println("Привет!");
					break;
				case("на каком языке ты написан"):
					System.out.println();
					System.out.println("На JAVA!");
					break;
				case("сколько тебе лет"):
					System.out.println();
					System.out.println("я только недавно");
					break;
				case("как тебя завут"):
					System.out.println();
					System.out.println("BotConsole");
					break;
				case("здарова"):
					System.out.println();
					System.out.println("Здравствуй!");
					break;
				default:
					System.out.println("такой команды нет!");
			// конец проверки
				}

      // конец цыкла
		}


	}
}

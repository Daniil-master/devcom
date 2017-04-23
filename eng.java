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
				case("good morning"):
					System.out.println();
					System.out.println("Good morning!");
					break;
				case("hello"):
					System.out.println();
					System.out.println("Hello!");
					break;
				case("what language you are wditten in"):
					System.out.println();
					System.out.println("On JAVA!");
					break;
				case("сколько тебе лет"):
					System.out.println();
					System.out.println("я только недавно");
					break;
				case("what is your name"):
					System.out.println();
					System.out.println("ConsoleBot");
					break;
				default:
					System.out.println("command not found!");
			// the end of checking
				}

      // the end of for
		}


	}
}

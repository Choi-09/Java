package 자바자료구조;

//1. 클래스
class Items2 {
	public int x;
	public int y;
	public int dir;

	public Items2(int x, int y, int dir) {
		x = x;
		y = y;
		dir = dir;
	}

	public String toString() {
		return "<" + x + ", " + y + ", " + dir + ">";
	}
}

//1. 클래스
class offsets2 {
	public offsets2(int ax, int bx) {
		a = ax; b = bx;
	}

	public int a;
	public int b;
}

//2. 메인클래스
public class Chap5_MyTestMaze {

	static offsets2 moves[] = new offsets2[8];

	public static int[][] maze = new int[100][100];
	public static int[][] mark = new int[100][100];

	public static void path(int[][] maze, int[][] mark, int ix, int iy) {

		mark[1][1] = 1;
		StackMaze st = new StackMaze(12*15);
		Items2 temp = new Items2(0, 0, 0);
		temp.x = 1;
		temp.y = 1;
		temp.dir = 2;
		st.push(temp);
		System.out.println("push()::"+temp.toString());


		while (!st.isEmpty()) // stack not empty
		{
			temp = st.pop(); // unstack
			int i = temp.x;
			int j = temp.y;
			int d = temp.dir;
			System.out.println("pop()::"+temp.toString());
			while (d < 8) // moves forward
			{ // outFile << i << " " << j << " " << d << endl;
				int g = i + moves[d].a;
				int h = j + moves[d].b;
				if ((g == 12) && (h == 15)) { // reached exit
												// output path
					System.out.println("the term near the exit: " + ix + " " + i + j);
					System.out.println("exit: " + ix + " " + iy);
					return;
				}
				if ((maze[g][h] == 0) && (mark[g][h] == 0)) { // new position
					mark[g][h] = 1;
					temp.x = i;  temp.y = j; temp.dir = d + 1;
					st.push(temp); // stack it
					System.out.println("push()::"+temp.toString());
					i = g; j = h; d = 0;
					
				} else
					d++; // try next direction
			}
		}
		System.out.println("no path in maze ");
	}

// 3. 메인 메소드
	public static void main(String[] args) {
		int[][] maze = new int[100][100];
		int[][] mark = new int[100][100];

	int input[][] = { // 12 x 15
				{ 0, 1, 0, 0, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1, 1 },
				{ 1, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1, 1 },
				{ 0, 1, 1, 0, 0, 0, 0, 1, 1, 1, 1, 0, 0, 1, 1 }, 
				{ 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 0, 1, 1, 0, 0 },
				{ 1, 1, 0, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1 }, 
				{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 0, 0, 1, 0, 1 },
				{ 0, 1, 1, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1 },
				{ 0, 0, 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1 }, 
				{ 1, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 1, 1, 1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0 }, 
				{ 0, 1, 0, 0, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0 }, };
	
	for(int ia = 0;ia<8;ia++) moves[ia]= new offsets2(0,0);
	moves[0].a=-1;moves[0].b=0;moves[1].a=-1;moves[1].b=1;
	moves[2].a=0;moves[2].b=1;moves[3].a=1;moves[3].b=1;moves[4].a=1;moves[4].b=0;
	moves[5].a=1;moves[5].b=-1;moves[6].a=0;moves[6].b=-1;moves[7].a=-1;moves[7].b=-1;

	for(
	int i = 0;i<14;i++)
	{
		for (int j = 0; j < 17; j++) {
			if ((i == 0) || (j == 0) || (i == 13) || (j == 16))
				maze[i][j] = 1;
			else {
				maze[i][j] = input[i - 1][j - 1];
			}
			mark[i][j] = 0;

		}
	}System.out.println("maze[12,15]::");for(
	int i = 0;i<=13;i++)
	{
		for (int j = 0; j <= 16; j++) {
			System.out.print(maze[i][j] + " ");

		}
		System.out.println();
	}System.out.println("mark::");for(
	int i = 0;i<=13;i++)
	{
			for (int j = 0; j <= 16; j++) {
				System.out.print(mark[i][j] + " ");

			}
			System.out.println();
		}

	path(maze, mark, 12, 15);
		System.out.println("mark::");
		for (int i = 1; i <= 12; i++) {
			for (int j = 1; j <= 15; j++) {
				System.out.print(mark[i][j] + " ");

			}
			System.out.println();
		}

	}
}
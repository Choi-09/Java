package 자바자료구조;

import java.util.Stack;

class Items {
	public int x;
	public int y;
	public int dir;
	
	public Items (int x, int y, int dir) {
		x = x;
		y = y;
		dir = dir;
	}
	//ostream& operator<<(ostream& os, items& item)
	//{
	//return os << item.x << "," << item.y << "," << item.dir;
	//}
	
//	public String toString() {
//		return " <" + x + "," + y + "," + dir + ">"; 
//	}
	
	//struct offsets {
	//int a, b;
	//};
}

class Offsets {
	private int a, b;
	

//
//enum directions { N, NE, E, SE, S, SW, W, NW };
//offsets moves[8];
}
 int [][] maze = new maze [100][100];
 int [][] mark = new mark [100][100];

public class Chap5_Test_Maze {
	void path(int m, int p)
//Output a path (if any) in the maze; rows is m, cols is p;
{
	//start at (1,1)
	mark[1][1] = 1;
	Stack2 st = new Stack2(20);
	Items temp;
	temp.x = 1; temp.y = 1; temp.dir = E;
	st.push(temp);

	while (stack != null) // stack not empty
	{
		temp = st.Pop(); // unstack
		int i = temp.x; int j = temp.y; int d = temp.dir;
		while (d < 8) // moves forward
		{
			//outFile << i << " " << j << " " << d << endl;
			int g = i + moves[d].a;
			int h = j + moves[d].b;
			if ((g == m) && (h == p)) { // reached exit
										// output path
				System.out.println(st); 

				System.out.println("the term near the exit: "  + i + " "+ j);
				System.out.println("exit" + m + " " + p);
				
				return;
			}
			if ((!maze[g][h]) && (!mark[g][h])) { // new position
				mark[g][h] = 1;
				//push the old temp to the stack, but the direction changes.
				//Because the neighbor in the direction of d has been checked.
				temp.x = i;  temp.y = j; temp.dir = d + 1;
				stack.Push(temp); // stack it
				i = g; j = h; d = N; // moves to (g,h)
			}
			else d++; // try next direction
		}
	}
	cout << "no path in maze " << endl;
}
/*
}

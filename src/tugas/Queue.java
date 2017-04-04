package tugas;

public class Queue
{
    public int mulai=0;
    public int akhir=0;
    private int[]muat=new int[4];

    public static void main(String[] args)
    {
        pertemuanketiga.Queue que = new pertemuanketiga.Queue();

        que.Enqueue(7);
        que.Print();
        que.Enqueue(8);
        que.Print();
        que.Enqueue(9);
        que.Print();
        que.Enqueue(10);
        que.Print();

        que.Dequeue();
        que.Print();
        que.Dequeue();
        que.Print();
        que.Dequeue();
        que.Print();
        que.Dequeue();
        que.Print();
        que.Dequeue();
        que.Print();
    }

    public void Enqueue(int x)
    {
        if(akhir < 4)
        {
            muat[akhir]=x;
            akhir++;
        }

        else
        {
            System.out.println("Sudah Penuh.");
        }
    }

    public int Dequeue()
    {
        if(akhir != mulai)
        {
            int temp = muat[mulai];
            for(int a=mulai; a<akhir; a++)
            {
                if(a==akhir-1)
                {
                    muat[a]=0;
                }

                else
                {
                    muat[a]=muat[a+1];
                }
            }
            akhir--;
            return temp;
        }

        else
        {
            System.out.println("Sudah Kosong.");
            return 0;
        }
    }

    public void Print()
    {
        String tanda="";
        for(int a=0; a<4; a++)
        {
            tanda += muat[a]+".";
        }

        System.out.println(tanda);
    }
}

public class Encryption {
    private int shiftRow;
    private int shiftCol;
    private String[][] arr;

    public Encryption(String[][] arr, int shiftRow, int shiftCol) {
        this.shiftRow = shiftRow;
        this.shiftCol = shiftCol;
        this.arr = arr;
    }

    public void horizontalShiftPos()
    {
        int s = Math.abs(shiftRow);
        for(int r = 0; r < arr.length; r++)
        {
            for(int i = 0; i < s; i++)
            {
                String temp = arr[r][arr[r].length - 1];
                for(int num = arr[r].length - 1; num > 0; num--)
                {
                    arr[r][num] = arr[r][num - 1];
                }
                arr[r][0] = temp;
            }
        }
    }

    public void horizontalShiftNeg()
    {
        int s = Math.abs(shiftRow);
        for(int r = 0; r < arr.length; r++)
        {
            for(int i = 0; i < s; i++)
            {
                String temp = arr[r][0];
                for(int num = 0; num < arr.length - 1; num++)
                {
                    arr[r][num] = arr[r][num + 1];
                }
                arr[r][arr.length - 1] = temp;
            }
        }
    }

    public void verticalShiftPos()
    {
        int s = Math.abs(shiftCol);
        for(int c = 0; c < arr[0].length; c++)
        {
            for(int i = 0; i < s; i++)
            {
                String temp = arr[arr.length - 1][c];
                for(int num = arr.length - 1; num > 0; num--)
                {
                    arr[num][c] = arr[num - 1][c];
                }
                arr[0][c] = temp;
            }
        }
    }

    public void verticalShiftNeg()
    {
        int s = Math.abs(shiftCol);
        for(int c = 0; c < arr[0].length; c++)
        {
            for(int i = 0; i < s; i++)
            {
                String temp = arr[0][c];
                for(int num = 0; num < arr[0].length - 1; num++)
                {
                    arr[num][c] = arr[num + 1][c];
                }
                arr[arr.length - 1][c] = temp;
            }
        }
    }

    public String[][] encrypt()
    {
        if(shiftRow > 0)
        {
            horizontalShiftPos();
        }
        else
        {
            horizontalShiftNeg();
        }
        if(shiftCol > 0)
        {
            verticalShiftPos();
        }
        else
        {
            verticalShiftNeg();
        }
        return arr;
    }

    public String[][] decrypt()
    {
        if(shiftRow > 0)
        {
            horizontalShiftNeg();
        }
        else
        {
            horizontalShiftPos();
        }
        if(shiftCol > 0)
        {
            verticalShiftNeg();
        }
        else
        {
            verticalShiftPos();
        }
        return arr;
    }

}


public class Demo {
    public static void main(String[] args) {
        Staff staff[] = new Staff[7];



        staff[0]=new staffFulltime(16041998,"Ngô Trọng Hiếu",25,"0979276402","imbakito1604@gmail.com",15000000,200000,3000000);
        staff[1]=new staffFulltime(9582782,"Nguyễn Hoàng Hiệp",27,"0849582782","hiepnguyen111996@yahoo.com",20000000,1000000,50000000);
        staff[2]=new staffFulltime(21071995,"Trần Xuân Ba",28,"355210795","thoitran2107@gmail.com",2000000,1000000,400000);

        staff[3]=new staffParttime(81998,"Hoàng Phương Nam",25,"0366198171","hoangphuongnam98@gmail.com",80);
        staff[4]=new staffParttime(31998,"Phạm Minh Hoàng",25,"0964002838","minhhoang301198@gmail.com",80);
        staff[5]=new staffParttime(2051997,"Nguyễn Mạnh Hiền",26,"0328601702","nguyenhien81f@gmail.com",80);
        staff[6]=new staffParttime(2051998,"Đào Văn Trọng",25,"0398299898","daovantrong98@gmail.com",80);

        double summ= getAvgSalary(staff);
        System.out.print("Trung bình lương của nhân viên trong công ty là: "+summ);

        Staff[] arr= getListEmployeeFullTime(staff,summ);
        System.out.println("\n nhân viên có lương thấp hơn lương trung bình:");
        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.print("Lương phải trả cho nhân viên bán thời gian là: "+totalSalaryPartTime(staff)+"\n");

        System.out.println("Sắp xếp nhân viên fulltime theo số lương tăng: ");
        sortEmployeeFullTime(staff);

    }

    public static double getAvgSalary(Staff[] array){
        double sum= 0;
        for(int i= 0; i<array.length; i++){
            if(array[i] instanceof staffFulltime){
                sum+= ((staffFulltime) array[i]).getNetSalary();
            }else {
                if(array[i] instanceof  staffFulltime){
                    sum+= ((staffParttime) array[i]).getNetSalary(20000);
                }
            }
        }
        return sum/array.length;
    }

    public static  Staff[] getListEmployeeFullTime(Staff[] array,double avg){
        int count=0;
        for(int i=0; i<array.length; i++){
            if( array[i] instanceof staffFulltime){
                double salary = ((staffFulltime) array[i]).getNetSalary();
                if(salary<avg){
                    count++;
                }
            }
        }
        Staff[] listEmployeeFullTime= new staffFulltime[array.length];
        if(count==0){
            System.out.println("Không nhân viên nào được trả thấp hơn mức trung bình!");
        } else {
            for(int i= 0 ; i<array.length;i++){
                if(array[i] instanceof staffFulltime){
                    if(((staffFulltime) array[i]).getNetSalary()<avg){
                        listEmployeeFullTime[i]=array[i];
                    }
                }
            }
        }
        return listEmployeeFullTime;
    }
    public static double totalSalaryPartTime(Staff[] arr){
        double total=0;
        for(int i= 0 ; i<arr.length; i++){
            if(arr[i] instanceof staffParttime){
                total += ((staffParttime)arr[i]).getNetSalary(100000);
            }
        }
        return total;
    }
    public static void sortEmployeeFullTime(Staff[] arr){
        Staff temp= arr[0];
        for(int i=0; i<arr.length-1; i++){
            for(int j=i+1; j<arr.length; j++){
                if( arr[i] instanceof staffFulltime && arr[j] instanceof  staffFulltime){
                    double salary1= ((staffFulltime) arr[i]).getNetSalary();
                    double salary2= ((staffFulltime) arr[j]).getNetSalary();
                    if(salary1> salary2){
                        temp= arr[j];
                        arr[j]=arr[i];
                        arr[i]= temp;
                    }
                }
            }

        }
        for(int i=0; i<arr.length; i++){
            if(arr[i] instanceof staffFulltime){
                System.out.println(arr[i]);
            }

        }
    }
}


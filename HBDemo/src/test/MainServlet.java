package test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;

/**
 * Servlet implementation class MainServlet
 */
@WebServlet("/MainServlet")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	doPost(request, response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	/*String eid=request.getParameter("eid");
	String name=request.getParameter("name");
	String salary=request.getParameter("salary");*/
	
	/*Employee e=new Employee();
	e.setEid(Integer.parseInt(eid));
	e.setEname(name);
	e.setSalary(Double.parseDouble(salary));*/
	//cm tm hql
	SessionFactory sf=new AnnotationConfiguration().configure().buildSessionFactory();
	Session ss=sf.openSession();
	Transaction tt=ss.beginTransaction();
	
	
	/*Object o=ss.save(e);  //update(e); delete(e);  saveorUpdate(e);
	if(o!=null)
		response.getWriter().println("Data Inserted...");*/
		
	// String sql="select *  from emPloyee_MaSteR where empid=?";
	//PS ps=con.ps
	//ps.set
	//ResultSet rs=ps.excuteQuery();
	/*  while(rs.next())
	 * {
	 *     int id=rs.getInt("id");
	 *     String name=rs.getString("name");
	 * }
	 * 
	 * */
	PrintWriter out=response.getWriter();
	/*	String hql="from Employee where eid=:a";
	Query q=ss.createQuery(hql);
	q.setInteger("a", 101);
	 Iterator it=q.iterate();
	 while(it.hasNext())
	 {
         Employee e=(Employee)it.next();
		 out.println(e.getEid());
		 out.println(e.getEname());
		 out.println(e.getSalary());
		 
	 }*/
	
	/*String hql="from Employee where eid=:a";
	Query q=ss.createQuery(hql);
	q.setInteger("a", 101);
	List<Employee> list=q.list();*/
	
	
/*String hql="update Employee set ename=:a,salary=:b where eid=:c";
Query q=ss.createQuery(hql);
q.setString("a", "Amit kumar");
q.setDouble("b", 50000.00);
q.setInteger("c", 101);
   int x=q.executeUpdate();
   if(x!=0)
	   out.println("Updated..");
*/
	/*String hql="delete from Employee where eid=:c";
	Query q=ss.createQuery(hql);
	//q.setString("a", "Amit kumar");
	//q.setDouble("b", 50000.00);
	q.setInteger("c", 101);
	   int x=q.executeUpdate();
	   if(x!=0)
		   out.println("Deleted..");*/
	
	//To Retrive single record via primary key column
	Employee e=(Employee)ss.get(Employee.class, 19902);
	//Employee e=(Employee)ss.get(Employee.class, 102);
	//select * from Employee_master where empid=102
	out.println(e.getEid());
	out.println(e.getEname());
	out.println(e.getSalary());
	
	
	tt.commit();
	ss.close();
		
		
		
		
		
		
		
	}

}

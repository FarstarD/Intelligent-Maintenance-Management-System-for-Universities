package com.chong.controller;

import com.chong.pojo.BaoBiao;
import com.chong.pojo.Books;
import com.chong.pojo.Limit;
import com.chong.pojo.Users;
import com.chong.service.BookService;
import com.chong.service.UserService;
import com.sun.org.apache.xpath.internal.operations.Mod;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.ServletRequestDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

@Controller
@RequestMapping("/books")
public class BookController {
    //controller 调 service 层
    @Qualifier("BookServiceImpl")
    private BookService bookService;

    @Qualifier("UserServiceImpl")
    private UserService userService;

    @Autowired
    public void setBookService(BookService bookService) {
        this.bookService = bookService;
    }
    @Autowired
    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    //查询所有维修信息
 /*   @RequestMapping("/allBooks")
    public String queryAllBooks(Model model){
        List<Books> books = bookService.queryTotalBooks();

        for (Books book : books) {
            System.out.println(book);
        }
        model.addAttribute("list",books);
        return "baseAllBook";
    }*/
    //查询所有维修信息--分页
    @RequestMapping("/limit")
    public String limit(int nowPage, Model model){

        Limit limit = new Limit();
//        int page = limit.getPage();       //当前页数
        int pagecount = limit.getPagecount();  //每页的记录数 3
        int sum;        //总页数      size/pagecount


        List<Books> books = bookService.queryTotalBooks();
        int size = books.size();    //总记录数   数据库数据长度
        limit.setRows(size);

        if (size % pagecount == 0){
            sum = size / pagecount;
        }else {
            sum = (size / pagecount) + 1;
        }

        limit.setPage(nowPage);
        int page = limit.getPage();

        if (page > sum){
            page = sum;
            limit.setPage(page);
            List<Books> list = bookService.queryTotalBooks2(limit.getCount());
            model.addAttribute("list",list);
        }else if (page < 1){
            page = 1;
            limit.setPage(page);
            List<Books> list = bookService.queryTotalBooks2(limit.getCount());
            model.addAttribute("list",list);
        }else {
            List<Books> list = bookService.queryTotalBooks2(limit.getCount());
            model.addAttribute("list",list);
        }
        model.addAttribute("rows",size);
        model.addAttribute("page",page);
        model.addAttribute("sum",sum);
        return "baseAllBook";

    }



    //根据姓名查询所有维修信息
    @RequestMapping("/allBooksByInputName")
    public String queryAllBooks(Model model,String inputName,int nowPage){
        Limit limit = new Limit();

        int pagecount = limit.getPagecount();  //每页的记录数 3
        int sum;        //总页数      size/pagecount

        limit.setPage(nowPage);
        int page = limit.getPage();

        List<Books> books = bookService.queryByInputName2(inputName);
        int size = books.size();

        System.out.println(size+"wwwwwwwwwwwwwwwwwwww");
        limit.setRows(size); //总记录数

        if (size % pagecount == 0){
            sum = size / pagecount;
        }else {
            sum = (size / pagecount) + 1;
        }

        if (books==null || size==0){
            return "redirect:/books/limit?nowPage=1";
        }

        if (page > sum){
            page = sum;
            limit.setPage(page);
            List<Books> list = bookService.queryByInputName(limit.getCount(), inputName);
            model.addAttribute("list",list);
        }else if (page < 1){
            page = 1;
            limit.setPage(page);
            List<Books> list = bookService.queryByInputName(limit.getCount(), inputName);
            model.addAttribute("list",list);
        }else {
            List<Books> list = bookService.queryByInputName(limit.getCount(), inputName);
            model.addAttribute("list",list);
        }
        model.addAttribute("rows",size);
        model.addAttribute("page",page);
        model.addAttribute("sum",sum);
        return "baseAllBook";

    }
    //根据id删除维修信息
    @RequestMapping("/deleteByBookID")
    public String deleteByBookID(int bookID){
        int i = bookService.deleteByBookId(bookID);
        if (i>0){
            System.out.println("删除成功");
        }

        return "redirect:/books/limit?nowPage=1";
    }
    //根据id查询所有维修信息
    @RequestMapping("/selectByBookID")
    public String selectByBookID(Model model,int bookID){
        List<Books> books = bookService.queryByBookId(bookID);
        if (books==null || books.size()==0){
            List<Books> books2 = bookService.queryTotalBooks();
            model.addAttribute("list",books2);
            return "baseAllBook";
        }
        model.addAttribute("list",books);
        return "baseAllBook";
    }
    //根据id修改表单信息/跳转修改页面
    @RequestMapping("/toUpdateByBookID")
    public String toupdateByBookID(Model model,int bookID){
        List<Books> list = bookService.queryByBookId(bookID);
        Books books = list.get(0);
        int bookID1 = books.getBookID();
        String inputName1 = books.getInputName();
        String phone1 = books.getPhone();
        String maintainThing1 = books.getMaintainThing();
        String finishName1 = books.getFinishName();
        String sayProblem1 = books.getSayProblem();
        int maintainNum1 = books.getMaintainNum();
        String bookAddress1 = books.getBookAddress();
        Date inputTime1 = books.getInputTime();
        Date finishTime1 = books.getFinishTime();
        String bookState1 = books.getBookState();
        String end1 = books.getEnd();
        model.addAttribute("bookID1",bookID1);
        model.addAttribute("inputName1",inputName1);
        model.addAttribute("phone1",phone1);
        model.addAttribute("maintainThing1",maintainThing1);
        model.addAttribute("finishName1",finishName1);
        model.addAttribute("sayProblem1",sayProblem1);
        model.addAttribute("maintainNum1",maintainNum1);
        model.addAttribute("bookAddress1",bookAddress1);
        model.addAttribute("bookState1",bookState1);
        model.addAttribute("inputTime1",inputTime1);
        model.addAttribute("finishTime1",finishTime1);
        model.addAttribute("end1",end1);
        return "syUpdateBooks";
    }
    @RequestMapping("/updateByBookID")
    public String updateByBookID(int bookID,String inputName,String phone,String maintainThing,String finishName,String sayProblem,int maintainNum,String bookAddress,Date inputTime,Date finishTime,String bookState,String end){
        int i = bookService.updateByBookId(bookID, inputName, phone, maintainThing, finishName, sayProblem, maintainNum, bookAddress, bookState, end);
        if (i>0){
            System.out.println("修改成功");
        }
        return "redirect:/books/limit?nowPage=1";
    }
    //

    //跳转填写维修表页面
    @RequestMapping("/toInputBooks")
    public String toInputBooks(HttpSession session,Model model,String nullWork){
        String userLoginInfo = (String) session.getAttribute("userLoginInfo");
        List<Users> list = userService.queryUserByLogin(userLoginInfo,nullWork);
        Users users = list.get(0);
        String userName = users.getUserName();
        model.addAttribute("inputName",userName);
        return "inputBook";
    }


/*    @org.springframework.web.bind.annotation.InitBinder
    public void InitBinder(ServletRequestDataBinder binder) {
            *//* HttpServletRequest request, *//*
        // 不要删除下行注释!!! 将来"yyyy-MM-dd"将配置到properties文件中
        // SimpleDateFormat dateFormat = new
        // SimpleDateFormat(getText("date.format", request.getLocale()));
        System.out.println("执行了InitBinder方法");
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, null, new CustomDateEditor(dateFormat, true));
    }*/

    @InitBinder
    public void initBinder(ServletRequestDataBinder binder) {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        binder.registerCustomEditor(Date.class, new CustomDateEditor(sdf, true));
    }

    //上传维修表
    @RequestMapping("/inputBooks")
    public String inputBooks(Books books){
        System.out.println(books.getFinishTime()+"shang");
        System.out.println(books.getInputTime()+"xia");
        int i = bookService.inputBooks(books);
        if (i>0){
            System.out.println("上传成功");
        }
        return "frame1";
    }

    //查询未处理的表单信息
    @RequestMapping("/nullDeal")
    public String queryNullDeal(String bookState, Model model){
        System.out.println(bookState+"==========================");
        List<Books> books = bookService.queryNullDeal(bookState);
        model.addAttribute("list1",books);
        return "nullBooks";
    }

    //查询正在处理的表单信息
    @RequestMapping("/statIng")
    public String statIng(String bookState,Model model){
        List<Books> books = bookService.queryDealIng(bookState);
        model.addAttribute("list2",books);
        return "stateIng";
    }

    //查询已完成的表单信息
    @RequestMapping("/statEnd")
    public String statEnd(String bookState,Model model){
        List<Books> books = bookService.queryDealEnd(bookState);
        model.addAttribute("list3",books);
        return "stateEnd";
    }

    //改变表单状态 未处理--->正在处理
    @RequestMapping("/updateState")
    public String updateState(@Param("bookID") int bookID,@Param("bookState") String bookState){
        System.out.println("<--------"+bookID+"------>");
        System.out.println("========="+bookState+"========");
        bookService.updateState(bookID,bookState);
        return "redirect:/books/nullDeal";
    }

    //改变表单状态 正在处理--->未处理
    @RequestMapping("/updateStateSec")
    public String updateStateSec(@Param("bookID") int bookID,@Param("bookState") String bookState){
        System.out.println("<--------"+bookID+"------>");
        System.out.println("========="+bookState+"========");
        bookService.updateStateSec(bookID,bookState);
        return "redirect:/books/statIng";
    }
    //改变表单状态 正在处理--->已完成
    /*@RequestMapping("finishTrue")
    public String finishTrue(@Param("inputName") String inputName,@Param("bookState") String bookState){

        System.out.println("inputNmae---------------------"+inputName);
        System.out.println("bookState---------------------"+bookState);
        bookService.updateStateTre(inputName,bookState);
        return "redirect:/books/statEnd";
    }*/

    //点击完成,完善资料
    @RequestMapping("/wanShanBook")
    public String wanShanBook(@Param("inputName") String inputName,@Param("bookState") String bookState,Model model){

        model.addAttribute("inputName",inputName);
        model.addAttribute("bookState",bookState);
        return "finishBooks";
    }

    //根据用户名 和 状态查询数据
    @RequestMapping("/inputNameAndState")
    public String inputNameAndState(@Param("inputName") String inputName,@Param("bookState") String bookState, String finishName, Date finishTime, String end,int bookID,String nullWork){
        System.out.println("提交姓名:::"+inputName);
        System.out.println("状态:::"+bookState);
        System.out.println("维修人员:::"+finishName);
        System.out.println("完成时间:::"+finishTime);
        System.out.println("结果描述:::"+end);
        bookService.inputNameAndState(inputName,bookState,finishName,finishTime,end);
        bookService.updateStateTre(bookID,bookState);

        return "redirect:/books/statIng";
    }

    //用户报修记录
    @RequestMapping("/baoXiu")
    public String baoXiu(HttpSession session, Model model,String nullWork){
        String userLoginInfo = (String) session.getAttribute("userLoginInfo");
        System.out.println("wwwwwwwwwwwwwww,"+userLoginInfo+",WWWWWWWWWWWWWWW");

        List<Users> list =  userService.queryUserByLogin(userLoginInfo,nullWork);
        Users users = list.get(0);
        String inputName = users.getUserName();

        List<Books> books = bookService.bookSelfe(inputName);
        System.out.println(books);

        model.addAttribute("list6",books);
        return "baoXiu";
    }

    //跳转保修表
    @RequestMapping("/toBaoBiao")
    public String toBaoBiao(Model model) throws ParseException {
        Calendar now = Calendar.getInstance();
        System.out.println(now);
        Date nowNow=now.getTime();
        now.add(Calendar.DAY_OF_MONTH, -30);
        String ThreeDate = new SimpleDateFormat("yyyy-MM-dd").format(now.getTime());
        System.out.println(ThreeDate);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date SanShiDate = simpleDateFormat.parse(ThreeDate);
        List<BaoBiao> baoBiaos = bookService.sumBooks(SanShiDate, nowNow);
        model.addAttribute("list7",baoBiaos);
        return "baoBiao";
    }

    //保修表查询-管理员
    @RequestMapping("/selectSumBooks")
    public String selectSumBooks(String maintainThing,Model model){
        List<BaoBiao> baoBiao = bookService.selectSumBooks(maintainThing);
        model.addAttribute("list7",baoBiao);
        return "baoBiao";
    }

    //用户报表功能
    @RequestMapping("/baoBiao")
    public String baoBiao(Model model,Date inputTime,Date finishTime) {

//        Date inputTime = sdf.parse(string);
//        Date finishTime = sdf2.parse(string2);
        System.out.println(inputTime);
        System.out.println(finishTime);
        List<BaoBiao> books = bookService.sumBooks(inputTime, finishTime);
        System.out.println(books);
        model.addAttribute("list7",books);
        return "baoBiao";
    }
}

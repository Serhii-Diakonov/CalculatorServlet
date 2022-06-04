function setInp(){
    let val=document.getElementById("inp").value;
    switch (val){
        case '1':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br>B:<input name='b'/><br><br><input type='submit' name='oper' value='-'>";
            break;
        }
        case '2':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br>B:<input name='b'/><br><br><input type='submit' name='oper' value='+'>";
            break;
        }
        case '3':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br>B:<input name='b'/><br><br><input type='submit' name='oper' value='*'>";
            break;
        }
        case '4':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br>B:<input name='b'/><br><br><input type='submit'  name='oper' value='/'>";
            break;
        }
        case '5':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br><input type='submit'  name='oper' value='sin(x)'>";
            break;
        }
        case '6':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br><input type='submit'  name='oper' value='cos(x)'>";
            break;
        }
        case '7':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br><input type='submit'  name='oper' value='tg(x)'>";
            break;
        }
        case '8':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br><input type='submit'  name='oper' value='ctg(x)'>";
            break;
        }
        case '9':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br><input type='submit' name='oper' value='ln(x)'>";
            break;
        }
        case '10':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br><input type='submit'  name='oper' value='lg(x)'>";
            break;
        }
        case '11':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br><input type='submit'  name='oper' value='sec(x)'>";
            break;
        }
        case '12':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br><input type='submit'  name='oper' value='cosec(x)'>";
            break;
        }
        case '13':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br><input type='submit'  name='oper' value='sh(x)'>";
            break;
        }
        case '14':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br><input type='submit'  name='oper' value='ch(x)'>";
            break;
        }
        case '15':{
            document.getElementById("form").innerHTML="A:<input name='a'/><br><br>B:<input name='b'/><br><br><input type='submit'  name='oper' value='a^b'>";
            break;
        }
    }
}
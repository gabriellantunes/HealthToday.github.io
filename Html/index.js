// 1º Irei criar duas constantes //
const botaoMenu = document.querySelector(".img2") //icone do menu normalmente
const botaoMenu2 = document.querySelector(".img3")
const menu = document.querySelector(".menu-lateral") //nome do menu da nav normalmente


// Iremos adicionar um evento para esse botao menu //
botaoMenu.addEventListener("click",() => {
    menu.classList.toggle("menu-lateral--ativo")
})

botaoMenu2.addEventListener("click",() => {
    menu.classList.toggle("menu-lateral--ativo")
})

$(document).ready(function(){
    $(window).scroll(function(){
        if ($(this).scrollTop() > 100) {
            $('a[href="#top"]').fadeIn();
        } else {
            $('a[href="#top"]').fadeOut();
        }
    });

    $('a[href="#top"]').click(function(){
        $('html, body').animate({scrollTop : 0},800);
        return false;
    });
});

function funcao1()
{
alert("Cadastro Realizado com Sucesso, Favor Inserir seus Dados Novamente");
}
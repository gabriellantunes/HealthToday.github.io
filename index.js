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
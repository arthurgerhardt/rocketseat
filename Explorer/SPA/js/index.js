import Router from'./router.js'
const router = new Router()
router.add('/', '/RocketSeat/Explorer/SPA/orientacao-a-objetos-no-js/pages/home.html')
router.add('/about', '/RocketSeat/Explorer/SPA/orientacao-a-objetos-no-js/pages/about.html')
router.add('/contact', '/RocketSeat/Explorer/SPA/orientacao-a-objetos-no-js/pages/contact.html')
router.add(404, '/RocketSeat/Explorer/SPA/orientacao-a-objetos-no-js/pages/404.html')

// const routes = {
//   "/": "/pages/home.html",
//   "/about": "/pages/about.html",
//   "/contact": "/pages/contact.html",
//   404: "/pages/404.html",
// }


// handle()

// window.onpopstate = () => handle()
// window.route = () => route()
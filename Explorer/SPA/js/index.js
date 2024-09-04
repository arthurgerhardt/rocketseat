import { Router } from './router.js'
const router = new Router()
router.add('/', "/RocketSeat/Explorer/SPA/pages/home.html")
router.add('/about', "/RocketSeat/Explorer/SPA/pages/about.html")
router.add('/contact', "/RocketSeat/Explorer/SPA/pages/contact.html")
router.add(404, "/RocketSeat/Explorer/SPA/pages/404.html")

router.handle()
 window.onpopstate = () => router.handle()
 window.route = () => router.route()
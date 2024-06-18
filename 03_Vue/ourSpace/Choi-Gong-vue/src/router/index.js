import { createRouter, createWebHistory } from 'vue-router';
import Choi from '@/pages/Choi.vue';
import Gong from '@/pages/Gong.vue';

const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/Choi',
      name: 'Choi',
      component: () => import('@/pages/Choi.vue'),
    },

    {
      path: '/Gong',
      component: () => import('@/pages/Gong.vue'),
    },
  ],
});

export default router;

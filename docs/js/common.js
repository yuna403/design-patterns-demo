// Logger
function log(msg, type = '') {
  const panel = document.getElementById('logPanel');
  if (!panel) return;
  const entry = document.createElement('p');
  entry.className = 'log-entry' + (type ? ' ' + type : '');
  const time = new Date().toLocaleTimeString();
  entry.textContent = `[${time}] ${msg}`;
  panel.appendChild(entry);
  panel.scrollTop = panel.scrollHeight;
}

function clearLog() {
  const panel = document.getElementById('logPanel');
  if (panel) panel.innerHTML = '';
}

// Tab switching
function initTabs() {
  document.querySelectorAll('.tab-btn').forEach(btn => {
    btn.addEventListener('click', () => {
      const group = btn.closest('.tabs').parentElement;
      group.querySelectorAll('.tab-btn').forEach(b => b.classList.remove('active'));
      group.querySelectorAll('.tab-content').forEach(c => c.classList.remove('active'));
      btn.classList.add('active');
      const target = document.getElementById(btn.dataset.tab);
      if (target) target.classList.add('active');
    });
  });
}

// Format number
function fmt(n, d = 2) {
  return Number(n).toFixed(d);
}

// Simple random hash for demo
function randomHash() {
  return Math.floor(Math.random() * 900000 + 100000).toString(16);
}
